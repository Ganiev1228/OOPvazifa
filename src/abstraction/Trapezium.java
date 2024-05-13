package abstraction;

public class Trapezium extends Geometric {

	@Override
	public void Area(int... sides) {
		if (sides.length != 3) {
			System.out.println("Trapetsiyaning katta,kichkina asoslari va bo'yini kiriting!");
			return;
		}
		int a = sides[0];
		int b = sides[1];
		int c = sides[2];
		int s = (a + b) * c;
		System.out.println("Area of trapezium=" + s);
	}

	@Override
	public void Perimeter(int... sides) {
		if (sides.length != 4) {
			System.out.println("Trapetsiyaning barcha tomonlarini kiriting!");
			return;
		}
		int p = 0;
		for (int i : sides) {
			p += i;
		}
		System.out.println("Trapetsiya perimetri=" + p);
	}

	public static void main(String ar[]) {
		Trapezium tr = new Trapezium();
//		System.out.println("Trapetsiyaning katta,kichkina asoslari va bo'yini kiriting!");
		tr.Area(6, 3, 5);
//		"Trapetsiyaning barcha tomonlarini kiriting ;"
		tr.Perimeter(5, 3, 4, 4);
	}
}
