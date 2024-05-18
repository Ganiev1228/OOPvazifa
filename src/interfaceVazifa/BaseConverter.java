package interfaceVazifa;

public class BaseConverter {

	public double selstokelv(int selsiy) {
		double kelvin = 273.15;
		double kelvin2 = selsiy + kelvin;
		return kelvin2;
	}

	public double selsToFaren(int selsiy) {
		int farenheit2 = selsiy * 9 / 5 + 32;
		return farenheit2;

	}
}
