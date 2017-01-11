package entity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceCupTest {
    DiceCup diceCup;
    @Before
    public void setUp() throws Exception {
        diceCup = new DiceCup(2);
    }

    @After
    public void tearDown() throws Exception {
        diceCup = null;
    }

    @Test
    public void getDices() throws Exception {
        assertTrue(diceCup.getDices() instanceof Dice[]);
    }

    @Test
    public void rollDices() throws Exception {
        for(int i = 0; i < 100; i++){
            diceCup.rollDices();
            assertEquals("Dices Not within bounds", 7, diceCup.getSum(), 5);
        }
    }

    @Test
    public void getSum() throws Exception {
        diceCup.rollDices();
        assertEquals("Dices Not within bounds", 7, diceCup.getSum(), 5);
    }

    @Test
    public void getDices1() throws Exception {
        assertTrue("Get Dices doesn't return array of dices", diceCup.getDices() instanceof Dice[]);
    }
}