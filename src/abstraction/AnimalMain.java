package abstraction;

public class AnimalMain {

	public static void main(String ar[]) {

		Animal an = new Dog();
		an.getName();
		an.sound();
		Animal an1 = new Duck();
		an1.getName();
		an1.sound();
		Animal an2 = new Cat();
		an2.getName();
		an2.sound();
	}

}
