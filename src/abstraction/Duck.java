package abstraction;

public class Duck extends Animal{

	@Override
	public void sound() {
		System.out.println("quak-quak");
		
	}

	@Override
	public void getName() {
		System.out.print("Ducky: ");
		
	}

}
