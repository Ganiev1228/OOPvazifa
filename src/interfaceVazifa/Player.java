package interfaceVazifa;

public abstract class Player implements information {

	String nameOfPlayer;
	String sportType;
	int numberPosition;
	String teamName;

	public String getNameOfPlayer() {
		return nameOfPlayer;
	}

	public void setNameOfPlayer(String nameOfPlayer) {
		this.nameOfPlayer = nameOfPlayer;
	}

	public String getSportType() {
		return sportType;
	}

	public void setSportType(String sportType) {
		this.sportType = sportType;
	}

	public int getNumberPosition() {
		return numberPosition;
	}

	public void setNumberPosition(int numberPosition) {
		this.numberPosition = numberPosition;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
