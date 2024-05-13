package abstraction;

public class Rectangle extends Geometric {

	@Override
	public void Area(int... sides) {
		if (sides.length != 2) {
			System.out.println("To'g'ri to'rtburchakning kalta va uzun tomoni kiritilmadi!");
			return;
		}
		int a = sides[0];
		int b = sides[1];
		int s = a * b;
		System.out.println("Area of rectangle=" + s);
	}

	@Override
	public void Perimeter(int... sides) {
		if (sides.length != 2) {
			System.out.println("To'g'ri to'rtburchakning kalta va uzun tomoni kiritilmadi!");
			return;
		}
		int a = sides[0];
		int b = sides[1];

		int p = (a + b) * 2;
		System.out.println("To'rtburchakning perimetri=" + p);
	}

	public static void main(String ar[]) {

		Rectangle rc = new Rectangle();
//		System.out.println("To'rtburchakning uzun va kalta tomonlarini kiriting.");
		rc.Area(4, 2);
		rc.Perimeter(8, 3);

	}

}
