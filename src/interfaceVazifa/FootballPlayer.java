package interfaceVazifa;
public class FootballPlayer extends Player{
	 int countOfRedCards;
	 int countOfYellowCards;
	 int countOfGoals;
	 
	 
	public int getCountOfRedCards() {
		return countOfRedCards;
	}

	public void setCountOfRedCards(int countOfRedCards) {
		this.countOfRedCards = countOfRedCards;
	}

	public int getCountOfYellowCards() {
		return countOfYellowCards;
	}

	public void setCountOfYellowCards(int countOfYellowCards) {
		this.countOfYellowCards = countOfYellowCards;
	}

	public int getCountOfGoals() {
		return countOfGoals;
	}

	public void setCountOfGoals(int countOfGoals) {
		this.countOfGoals = countOfGoals;
	}

	@Override
	public  void getinfo() {
		setNameOfPlayer("Kaka");
    	setSportType("Football");
    	setNumberPosition(8);
    	setTeamName("Real Madrid");
    	setCountOfGoals(23);
    	setCountOfYellowCards(5);
    	setCountOfRedCards(1);
    	System.out.println("Player name: "+nameOfPlayer);
        System.out.println("Sport type: "+sportType);
        System.out.println("Number: "+numberPosition);
        System.out.println("Team name: "+teamName);
        System.out.println("Count of goals: "+countOfGoals);
        System.out.println("Count of red cards: "+countOfRedCards);
        System.out.println("Count of yellow cards: "+countOfYellowCards);
	}
	
	@Override
	public void getTeamInfo() {
		
	}

	
}
