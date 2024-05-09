package oopVazifa;

public class Car1 {
	public static void main(String ar[]) {
		Car n = new Car();
		n.setRangi("qora");
		n.setModeli("2310");
		n.setNarxi(100);
		n.setTuzilma("Mexanika");

		System.out.printf("rangi-%s\nmodeli-%s\nnarxi-%s\ntuzilma-%s",
				n.rangi, n.modeli, n.narxi, n.tuzilma);
		
	}

}
