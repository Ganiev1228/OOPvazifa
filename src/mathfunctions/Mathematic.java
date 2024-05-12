package mathfunctions;

public class Mathematic {

	public void yigindi(int a, int b) {
		System.out.println(Math.addExact(a, b));
	}

	public void ayirma(int a, int b) {
		System.out.println(Math.subtractExact(a, b));
	}

	public void kopaytma(int a, int b) {
		System.out.println(Math.multiplyExact(a, b));
	}

	public void boluv(int a, int b) {
		System.out.println(Math.floorDiv(a, b));
	}

}
