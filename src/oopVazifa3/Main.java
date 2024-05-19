package oopVazifa3;

public class Main {

	public static void main(String ar[]) {
		Student st = new Student("G'ishmat", "Fergana", "Program", 25, 100);
		System.out.println(st.toString());
		Staff sf = new Staff("Eshmat", "France", "School", 200);
		System.out.println(sf.toString());
	}
}
