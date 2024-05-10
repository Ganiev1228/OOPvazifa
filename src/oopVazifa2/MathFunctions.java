package oopVazifa2;

public class MathFunctions {

	static double r;
	static double s;
	static double PI = 3.14;

	public static double getR() {
		return r;
	}

	public static void setR(double r) {
		MathFunctions.r = r;
	}

	public static void doirayuzasi() {
		s = PI * (r * r);
	}

	public static void Uchburchakyuzasi(double a, double b, double c) {
		double p = (a + b + c) / 2;
		double ds = p * (p - a) * (p - r) * (p - s);
		System.out.println("Uchburchak yuzasi: " + Math.sqrt(ds));
	}
	public static void darajagakotarish (int d, int d1) {
		double d2 = Math.pow(d,d1);
		System.out.println(d+" sonining "+d1+" chi darajasi="+d2+"\n");
	}
}
