package inheritance.sounds;

public class Subwoofer extends Sounds{
	
	String turi;
	int diapazonChastotoasi;
	
	public String getTuri() {
		return turi;
	}
	public void setTuri(String turi) {
		this.turi = turi;
	}
	public int getDiapazonChastotoasi() {
		return diapazonChastotoasi;
	}
	public void setDiapazonChastotoasi(int diapazonChastotoasi) {
		this.diapazonChastotoasi = diapazonChastotoasi;
	}
	
	public static void main  (String ar[]) {
		Subwoofer sb = new Subwoofer();
		sb.setBrand("Sony");
		sb.setModel("SM-211");
		sb.setNarx(100);
		sb.setTuri("Subwoofer");
		sb.setDiapazonChastotoasi(200);
		sb.setRang("Black");
		System.out.println("Brand:"+sb.brand+"\nModel:"+sb.model+"\nNarx:"+sb.narx+"\nTuri:"+sb.turi+
		     "\nDiapazonChastotasi:"+sb.diapazonChastotoasi+"\nColor:"+sb.rang);
		
		
	}
	

}
