package interfaceVazifa;

public class VolleyballPlayer extends Player {

	int numberOfPoints;
	

	public int getNumberOfPoints() {
		return numberOfPoints;
	}

	public void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}

	@Override
	public void getinfo() {
		setNameOfPlayer("Eshmat");
		setSportType("Volleyball");
		setNumberPosition(6);
		setNumberOfPoints(14);
		setTeamName("England");
		System.out.println("Player name: "+nameOfPlayer);
		System.out.println("Sport type: "+sportType);
		System.out.println("Player number: "+numberOfPoints);
		System.out.println("Points: "+numberOfPoints);
		System.out.println("Team name: "+teamName);
	}

	@Override
	public void getTeamInfo() {
		
	}
}
