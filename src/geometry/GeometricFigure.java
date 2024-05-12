package geometry;

public class GeometricFigure {

	public void Uchburchakyuzasi(int a, int b, int c) {
		int p = (a + b + c) / 2;
		int ds = p * (p - a) * (p - b) * (p - c);
		if (ds > 0) {
			System.out.println("Area of triangle: " + Math.sqrt(ds));
		} else {
			System.out.println("Bunday uchburchak mavjud emas!");
		}
	}
	public void trapetsiyayuzi(int a, int b, int d) {
		int s = (a + b) * d;
		System.out.println("Area of trapezium=" + s);
	}
	public void tortburchakyuzi(int a, int b) {
		int s = a * b;
		System.out.println("Area of rectangle=" + s);
	}
}
