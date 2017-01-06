package entity.language;

import entity.Player;

public class Dansk implements Language{

	@Override
	public String notifyLangChange(){
		return "Sproget er nu sat til dansk!";
	}

	@Override
	public String askForNumberOfPlayers() {
		return "Hvor mange spillere skal være med? Der kan vælges fra 2 til 6";
	}

	@Override
	public String askForPlayerName(int playerNumber){
		return "Indtast spiller " + playerNumber + "'s navn, alle spillere skal have forskellige navne.";
	}

	@Override
	public String fieldDescription(int fieldNumber) {
		String fieldDescription = null;
		switch (fieldNumber) {
		case 0:  fieldDescription = "Modtag 4000";
		break;
		case 2:
		case 7:
		case 17:
		case 22:
		case 33:
		case 36: fieldDescription = "Prøv lykken";
		break;
		case 4:  fieldDescription = "Betal 10% eller kr. 4000";
		break;
		case 10: fieldDescription = "På besøg i fængselet";
		break;
		case 20: fieldDescription = "Parkering";
		break;
		case 30: fieldDescription = "De fængsles";
		break;
		case 38: fieldDescription = "Betal kr. 2000 i skat";
		break;
		}
		return fieldDescription;
	}

	@Override
	public String fieldNames(int fieldNumber) {
		String fieldName = null;
		switch (fieldNumber) {
		case 0:  fieldName = "START";
		break;
		case 1:  fieldName = "Rødovrevej";
		break;
		case 2:  fieldName = "Prøv lykken";
		break;
		case 3:  fieldName = "Hvidovrevej";
		break;
		case 4:  fieldName = "Skat";
		break;
		case 5:  fieldName = "SFL";
		break;
		case 6:  fieldName = "Roskildevej";
		break;
		case 7:  fieldName = "Prøv lykken";
		break;
		case 8:  fieldName = "Valby Langgade";
		break;
		case 9:  fieldName = "Alløgade";
		break;
		case 10: fieldName = "På Besøg";
		break;
		case 11: fieldName = "Frederiksberg Alle";
		break;	
		case 12: fieldName = "TUBORG";
		break;	
		case 13: fieldName = "Bølowsvej";
		break;	
		case 14: fieldName = "Gl. Kongevej";
		break;	
		case 15: fieldName = "Kalundb./Århus";
		break;	
		case 16: fieldName = "Bernstorffsvej";
		break;	
		case 17: fieldName = "Prøv lykken";
		break;	
		case 18: fieldName = "Hellerupvej";
		break;	
		case 19: fieldName = "Strandvej";
		break;	
		case 20: fieldName = "Parkering";
		break;	
		case 21: fieldName = "Trianglen";
		break;	
		case 22: fieldName = "Prøv lykken";
		break;
		case 23: fieldName = "Østerbrogade";
		break;
		case 24: fieldName = "Grønningen";
		break;
		case 25: fieldName = "DFDS";
		break;
		case 26: fieldName = "Bredgade";
		break;
		case 27: fieldName = "Kgs.Nytorv";
		break;
		case 28: fieldName = "Coca Cola";
		break;
		case 29: fieldName = "Østergade";
		break;
		case 30: fieldName = "De Fængsles";
		break;
		case 31: fieldName = "Amagertorv";
		break;
		case 32: fieldName = "Vimmelskaftet";
		break;
		case 33: fieldName = "Prøv lykken";
		break;
		case 34: fieldName = "Nygade";
		break;
		case 35: fieldName = "Halssk./Knudsh.";
		break;
		case 36: fieldName = "Prøv lykken";
		break;
		case 37: fieldName = "Frederiksberg gade";
		break;
		case 38: fieldName = "Skat";
		break;
		case 39: fieldName = "Rådhuspladsen";
		break;
		}
		return fieldName;
	}

	@Override
	public String fieldPrices(int fieldPrice) {
		return "kr. " + fieldPrice;
	}

	@Override
	public String readyToBegin(){
		return "Spillet vil nu begynde. Spillet er vundet af den spiller der står tilbage når de andre er bankerot!";
	}

	@Override
	public String winnerMsg(Player player){
		return player.getName() + " har vundet spillet med " + player.getBankAccount().getBalance() + " kr.!";
	}

	@Override
	public String preMsg(Player player){
		return "Det er " + player.getName() + "'s tur, tryk på en knap!";
	}

	@Override
	public String throwDices(){
		return "Slå Terning";
	}

	@Override
	public String build() {
		return "Bygge";
	}
	
	@Override
	public String trade(){
		return "Handle";
	}
	
	@Override
	public String youGetJailedForThreeTimesEqual() {
		return "De fængles for at have slået to ens 3 gange i træk!";
	}

	@Override
	public String getChanceCardMsg(int topCardNumber) {
		// TODO Nedskriv de forskellige tekster til Chancekortene - HUSK DEFAULT BESKED: "Prøv lykken"
		return null;
	}

	@Override
	public String fieldMsg(int fieldNumber){
		String fieldString = null;
		// TODO ret det her!
		switch (fieldNumber) {
		case 0:  fieldString = "START";
		break;
		case 1:  fieldString = "Du er ankommet til Rødovrevej";
		break;
		case 2:  fieldString = "Du sejler en tur med Second Sail";
		break;
		case 3:  fieldString = "Du finder et stort krater og undersøger nærmere!";
		break;
		case 4:  fieldString = "Du er landet på et skatte felt!";
		break;
		case 5:  fieldString = "Du er ankommet til et højt bjerg!";
		break;
		case 6:  fieldString = "Du ser klosteret i distancen og undersøger det nærmere";
		break;
		case 7:  fieldString = "Du er nået til den kolde ørken!";
		break;
		case 8:  fieldString = "Du sejler en tur med Sea Grover";
		break;
		case 9:  fieldString = "Du er kommet til en sort grotte! ";
		break;
		case 10: fieldString = "Du udforsker en grotte der ligner en guldmine";
		break;
		case 11: fieldString = "Du er ankommet til en stor mur!";
		break;	
		case 12: fieldString = "Du faldet ned i et stort hul!";
		break;	
		case 13: fieldString = "Du er ankommet til den famøse bjergby!";
		break;	
		case 14: fieldString = "Du sejler en tur med The Buccaneers";
		break;	
		case 15: fieldString = "Du er nået til det sydlige kastel!";
		break;	
		case 16: fieldString = "Du går forsigtigt igennem den befæstede by";
		break;	
		case 17: fieldString = "Du passerer den store slotsport";
		break;	
		case 18: fieldString = "Du har fundet en forladt campingvogn!";
		break;	
		case 19: fieldString = "Du kæmper dig op i det høje tårn!";
		break;	
		case 20: fieldString = "Du sejler en tur med Privateer Armade";
		break;	
		case 21: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 22: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 23: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 24: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 25: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 26: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 27: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 28: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 29: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 30: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 31: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 32: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 33: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 34: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 35: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 36: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 37: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 38: fieldString = "Du er inviteret ind i det store slot!";
		break;
		case 39: fieldString = "Du er inviteret ind i det store slot!";
		break;
		}
		return fieldString;
	}

	@Override
	public String landedOnOwnedField(Player owner) {
		return "Dette felt ejes af " + owner.getName() + ", det kommer til at koste!";
	}
	
	@Override
	public String youPaidThisMuchToThisPerson(int amountPayed, Player owner) {
		return "Du betalte " + amountPayed + " kr. til " + owner.getName() + ".";
	}
	
	@Override
	public String youOwnThisField() {
		return "Slap af! Du ejer selv dette felt ;)";
	}
	
	@Override
	public String getTaxChoice() {
		return "Du kan vælge enten at betale 4000 kr eller 10% af din pengebeholdning,"
				+ "\nvil du betale 10%?";
	}
	
	@Override
	public String youAreBroke() {
		return "Du er desværre gået bankerot, tak for spillet!";
	}
	
	@Override
	public String notBuildable(){
		return "Du har ingen grunde du kan bygge på.";
	}
	
	@Override
	public String choosePlotToBuildOn(){
		return "Vælg en grund at bygge på.";
	}
	
	@Override
	public String noDemolitionableProperties(){
		return "Du har ingen grunde hvor du kan nedrive bygninger.";
	}
	
	@Override
	public String choosePropertyToDemolishOn(){
		return "Vælg den grund hvor du vil nedrive en bygning.";
	}
	
	@Override
	public String noTradeableProperties(){
		return "Du har ingen felter at handle med.";
	}
	
	@Override
	public String choosePlotTrade(){
		return "Vælg det felt du vil handle.";
	}
	
	@Override
	public String choosePropertyBuyer(){
		return "Hvem køber feltet?";
	}
	
	@Override
	public String enterTradePrice(){
		return "Hvilken pris skal feltet sælges til?";
	}
	
	@Override
	public String confirmTrade(){
		return "Vil du bekræfte handlen?";
	}
	
	@Override
	public String yes() {
		return "Ja!";
	}

	@Override
	public String no() {
		return "Nej!";
	}
	
	@Override
	public String noPawnableFields(){
		return "Du har ingen felter at pantsætte.";
	}
	
	@Override
	public String choosePropertyToPawn(){
		return "Vælg et felt at pantsætte.";
	}
	
	@Override
	public String pawnSuccessful(){
		return "Din grund er blevet pantsat.";
	}
	
	@Override 
	public String pawnUnsuccessful(){
		return "Din grund kunne ikke pantsættes.";
	}
	
	@Override 
	public String noPawnedProperties(){
		return "Du har ingen felter at hæve pantsætningen på.";
	}
	
	@Override 
	public String choosePropertyToUndoPawn(){
		return "Vælg en grund at hæve pantsætningen på.";
	}
	
	@Override 
	public String undoPawnSuccessful(){
		return "Din pantsætning er blevet indfriet";
	}
	
	@Override
	public String undoPawnUnsuccessful(){
		return "Din pantsætning kunne ikke indfries";
	}
	
	@Override
	public String buyingOfferMsg(int price) {
		return "Dette felt er ikke ejet af nogen, vil du købe det for " + price + " kr.?";
	}
	
	@Override
	public String purchaseConfirmation() {
		return "Du har nu købt feltet!";
	}

	@Override
	public String notEnoughMoney() {
		return "Du havde desværre ikke nok penge..";
	}
	
	@Override
	public String enterAuctionPrice(){
		return "Hvad blev auktionsprisen?";
	}
	
	@Override
	public String pawn(){
		return "Pantsæt";
	}
	
	@Override
	public String demolish(){
		return "Nedriv bygninger";
	}
	
	@Override
	public String bankrupt(){
		return "Erklær konkurs";
	}
	
	@Override
	public String toPay(int targetAmount){
		return "Du skal betale " + targetAmount + "kr., men du har ikke penge nok. Hvad vil du gøre?";
	}
	
	@Override
	public String canGetMoney(){
		return "Du kan godt få nok penge, ved at nedrive bygninger og pantsætte ejendomme!";
	}
	
	// ALL METHODS UNDER THIS LINE AREN'T USED IN THIS CURRENT VERSION OF THE GAME.

	@Override
	public String nonOwnableFieldEffectMsg(int fieldNumber) {
		String message = null;
		switch (fieldNumber) {
		case 0:  message = "Du er passeret START og fÃ¥r 4.000 kr.";
		break;
		case 2: message = "Du landede på Prøv lykken og du skal tage et af chancekortene";
		break;
		case 4: message = "Du landede på Skat feltet og skal betale 10% eller kr.4000";
		break;
		case 7: message = "Du landede på Prøv lykken og du skal tage et af chancekortene";
		break;
		case 10: message = "Du er på besøg i fængslet";
		break;
		case 17: message = "Du landede på Prøv lykken og du skal tage et af chancekortene";
		break;
		case 22: message = "Du landede på Prøv lykken og du skal tage et af chancekortene";
		break;
		case 30: message = "Du landede på fængsel og skal går i fængsel";
		break;
		case 33: message = "Du landede på Prøv lykken og du skal tage et af chancekortene";
		break;
		case 36: message = "Du landede på Prøv lykken og du skal tage et af chancekortene";
		break;
		case 38: message = "Du landede på Skat feltet og skal betale 10% eller kr.4000";
		break;
		}
		return message;
	}

	@Override
	public String menu(){
		return "Tast 1 for at skifte antal sider på terningerne.\n" +
				"Tast 2 for at ændre sprog.\n" +
				"Tast 3 for at vise scoren.\n"+
				"Tast 4 for at afslutte spillet.\n" +
				"Tast 5 for at fortsætte spillet.";
	}

	@Override
	public String printRules(){
		return "Dette spil er et terningespil mellem 2 personer. Du slår med terninger og lander på et felt fra 1-39. \n Her er vist listen over felterne: \n"
				+ "1. Rødovrevej: 1200 kr. \n"
				+ "2. Prøv lykken:  \n"
				+ "3. Hvidovrevej: 1200 kr. \n"
				+ "4. Skat: 10% eller 4.000 kr. \n"
				+ "5. SFL: 4000 kr. \n"
				+ "6. Roskildevej: 2000 kr. \n"
				+ "7. Prøv lykken:  \n"
				+ "8. Valby Langgade: 2000 kr. \n"
				+ "9. Alløgade: 2400 kr. \n"
				+ "10. Fængsel \n"
				+ "11. Frederiksberg Alle: 2800 kr. \n"
				+ "12. TUBORG: 3000 kr. \n"
				+ "13. Bølowsvej: 4700 kr. \n"
				+ "14. Gl. Kongevej: 3200 kr. \n"
				+ "15. Kalundborg/ Århus: 4000 k. \n"
				+ "16. Bernstorffsvej: 3600 kr. \n"
				+ "17. Prøv lykken:  \n"
				+ "18. Hellerupvej: 3600 kr. \n"
				+ "19. Strandvej: 4000 kr. \n"
				+ "20. Parkering: Bank \n"
				+ "21. Trianglen: 4400 kr. \n"
				+ "22. Prøv lykken:  \n"
				+ "23. Østerbrogade: 4400 kr. \n"
				+ "24. Grønningen: 4800 kr. \n"
				+ "25. DFDS SEAWAYS: 4000 kr. \n"
				+ "26. Bredgade: 5200 kr. \n"
				+ "27. Kgs.Nytorv: 5200 kr. \n"
				+ "28. CocaCola: 3000 kr. \n"
				+ "29. Østergade: 5600 kr. \n"
				+ "30. Fængsle: Fængsel \n"
				+ "31. Amagertorv: 6000 kr. \n"
				+ "32. Vimmelskaftet: 6000 kr. \n"
				+ "33. Prøv lykken:  \n"
				+ "34. Nygade: 6400 kr. \n"
				+ "35. Helsskov/ Knudshoved: 4000 kr. \n"
				+ "36. Prøv lykken:  \n"
				+ "37. Frederiksberggade: 7000 kr. \n"
				+ "38. Skat: 2000 kr. \n"
				+ "39. Rådhuspladsen: 8000 kr. \n";
	}

	@Override
	public String printScore(Player[] players){
		StringBuilder str = new StringBuilder();
		str.append("Stillingen er:");
		for (int i = 0; i < players.length; i++) 
			str.append("\n").append(players[i].getName()).append(" har ").append(players[i].getBankAccount().getBalance());
		return str.toString();
	}

	@Override
	public String changeDices(){
		return "Indtast hvor mange øjne de to terninger skal have, på formatet \"x,y\" - summen skal være 12"; // Summen mÃ¥tte kun gÃ¥ op til 12?
	}

	@Override
	public String printDiceChangeSucces(){
		return "Terningerne er nu ændret!";
	}

	@Override
	public String printDiceChangeNotExecuted(){
		return "Terningerne kunne ikke ændres";
	}
}

