package inheritance;

public class Lor extends Doctor{
	
	private String soha;
	private int tajriba;
	
	public String getSoha() {
		return soha;
	}

	public void setSoha(String soha) {
		this.soha = soha;
	}

	public int getTajriba() {
		return tajriba;
	}

	public void setTajriba(int tajriba) {
		this.tajriba = tajriba;
	}

	public static void main (String []ar) {
		
		Lor lor = new Lor();
		lor.setIsmi("Anvar");
		lor.setYoshi(43);
		lor.setSoha("Lor shifokori");
		lor.setTajriba(12);
		System.out.println("Ismi: "+lor.ismi+";\nYoshi: "+lor.yoshi+";\nSoha: "+lor.soha+";\nIsh tajribasi: "+lor.tajriba+" yil;");
	}

}
