package inheritance;

public class Laptop extends Computers{
	
	String rangi;
	String turi;
	public String getRangi() {
		return rangi;
	}
	public void setRangi(String rangi) {
		this.rangi = rangi;
	}
	public String getTuri() {
		return turi;
	}
	public void setTuri(String turi) {
		this.turi = turi;
	}
	 
	public static void main (String ar[]) {
		Laptop lp = new Laptop();
		lp.setBrand("Acer");
		lp.setModel("MK-421");
		lp.setNarx(300);
		lp.setProtsessor("AMD Ryzen");
		lp.setRangi("Qizil");
		lp.setTuri("Noutbuk");
		System.out.print("Brand: "+lp.brand+"\nModel:"+lp.model+"\nCost:"+lp.narx+"\nProtsessor:"+lp.protsessor+""
				+ "\nRangi:"+lp.rangi+"\nType:"+lp.turi);
	}


}
