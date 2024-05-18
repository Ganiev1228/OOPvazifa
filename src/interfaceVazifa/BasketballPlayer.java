package interfaceVazifa;

public class BasketballPlayer extends Player {

	int countOfPoints;
	public int getCountOfPoints() {
		return countOfPoints;
	}

	public void setCountOfPoints(int countOfPoints) {
		this.countOfPoints = countOfPoints;
	}

	@Override
	public void getinfo() {
		setNameOfPlayer("Bryant");
		setTeamName("Lakers");
		setNumberPosition(24);
		setSportType("Basketball");
		setCountOfPoints(33643);
		System.out.println("Player name: "+nameOfPlayer);
		System.out.println("Team name: "+teamName);
		System.out.println("Player number: "+numberPosition);
		System.out.println("Sport type: "+sportType);
		System.out.println("Count of position: "+countOfPoints);
		

	}

	@Override
	public void getTeamInfo() {
		// TODO Auto-generated method stub
		
	}
	
	

}
