package interfaceVazifa;

public class PointGuard extends BasketballPlayer{
	int countOfGuard;

	public void setCountOfGuard(int countOfGuard) {
		this.countOfGuard = countOfGuard;
	}
	@Override
	public void getinfo() {
       setCountOfGuard(12);
       System.out.println("Count of guards: "+countOfGuard);
	}
	

}
