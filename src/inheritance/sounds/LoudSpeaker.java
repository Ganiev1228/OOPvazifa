package inheritance.sounds;


public class LoudSpeaker extends Sounds {
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
		LoudSpeaker ld = new LoudSpeaker();
		ld.setBrand("Panasonic");
		ld.setModel("P-890");
		ld.setNarx(80);
		ld.setTuri("Loudspeaker");
		ld.setDiapazonChastotoasi(200000);
		ld.setRang("Yellow");
		System.out.println("Brand:"+ld.brand+"\nModel:"+ld.model+"\nNarx:"+ld.narx+"\nTuri:"+ld.turi+
		     "\nDiapazonChastotasi:"+ld.diapazonChastotoasi+"\nColor:"+ld.rang);
		
		
	}


}
