package abstraction;

public class Triangle extends Geometric {

	@Override
	public void Area(int... sides) {
		if (sides.length != 3) {
			System.out.println("Uchburchakning uchchala tomoni kiritilmadi!");
			return;
		}
		int a = sides[0];
		int b = sides[1];
		int c = sides[2];
		int p = (a + b + c) / 2;
		int ds = p * (p - a) * (p - b) * (p - c);
		if (ds > 0) {
			System.out.println("Area of triangle=" + Math.sqrt(ds));
		} else {
			System.out.println("Bunday uchburchak mavjud emas!");
		}
	}

	@Override
	public void Perimeter(int... sides) {
		if (sides.length != 3) {
			System.out.println("Uchburchakni barcha tomonlari kiritilmadi!");
		}
		int p = 0;
		for (int i : sides) {
			p += i;
		}
		System.out.println("Uchburchak perimetri=" + p);
	}

	public static void main(String ar[]) {
		Triangle gm = new Triangle();
		gm.Area(5, 3, 4);
		gm.Perimeter(5, 6, 4);
	}
}
