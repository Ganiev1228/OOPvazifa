package inheritance;

public class Xirurg extends Doctor{
	
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
		
		Xirurg xirurg = new Xirurg();
		xirurg.setIsmi("Alisher");
		xirurg.setYoshi(39);
		xirurg.setSoha("Jarroh");
		xirurg.setTajriba(8);
		System.out.println("Ismi: "+xirurg.ismi+";\nYoshi: "+xirurg.yoshi+";\nSoha: "+xirurg.soha+";\nIsh tajribasi: "+xirurg.tajriba+" yil;");
	}


}
