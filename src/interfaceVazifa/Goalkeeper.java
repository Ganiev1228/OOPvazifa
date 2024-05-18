package interfaceVazifa;

public class Goalkeeper extends FootballPlayer{
	int countOfSaves;

	public int getCountOfSaves() {
		return countOfSaves;
	}

	public void setCountOfSaves(int countOfSaves) {
		this.countOfSaves = countOfSaves;
	}
	   
	@Override
	public void getinfo() {
//    	setNameOfPlayer("Kaka");
//    	setSportType("Football");
//    	setNumberPosition(8);
//    	setTeamName("Real Madrid");
//    	setCountOfGoals(23);
//    	setCountOfYellowCards(5);
//    	setCountOfRedCards(1);
//    	System.out.println("Player name: "+nameOfPlayer);
//        System.out.println("Sport type: "+sportType);
//        System.out.println("Number: "+numberPosition);
//        System.out.println("Team name: "+teamName);
//        System.out.println("Count of goals: "+countOfGoals);
//        System.out.println("Count of red cards: "+countOfRedCards);
//        System.out.println("Count of yellow cards: "+countOfYellowCards);
        setNameOfPlayer("Casillas");
        setCountOfSaves(12);
        System.out.println("Goalkeeper: "+nameOfPlayer);
        System.out.println("Count of saves: "+countOfSaves);
        
        
//		super.getinfo();
	}
}
