package abstraction;

public class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("gaw-gaw");
		
	}

	@Override
	public void getName() {
		System.out.print("Rex: ");
		
	}

}
