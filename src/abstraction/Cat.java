package abstraction;

public class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("meow-meow");
		
	}

	@Override
	public void getName() {
		System.out.print("Kitty: ");
		
	}

}
