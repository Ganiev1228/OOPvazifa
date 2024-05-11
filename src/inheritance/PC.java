package inheritance;

public class PC extends Computers{
	
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
		PC pc = new PC();
		pc.setBrand("Asus");
		pc.setModel("MK-1984");
		pc.setNarx(300);
		pc.setProtsessor("Core-i5");
		pc.setRangi("Qizil");
		pc.setTuri("Personal computer");
		System.out.print("Brand: "+pc.brand+"\nModel:"+pc.model+"\nCost:"+pc.narx+"\nProtsessor:"+pc.protsessor+""
				+ "\nRangi:"+pc.rangi+"\nType:"+pc.turi);
	}
	

}
