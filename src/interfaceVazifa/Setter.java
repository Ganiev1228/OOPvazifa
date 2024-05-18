package interfaceVazifa;

public class Setter extends VolleyballPlayer {
	int CountOfSets;

	public int getCountOfSets() {
		return CountOfSets;
	}

	public void setCountOfSets(int countOfSets) {
		CountOfSets = countOfSets;
	}

	@Override
	public void getinfo() {
		setCountOfSets(200);
		System.out.println("Count of sets: " + CountOfSets);
	}

}
