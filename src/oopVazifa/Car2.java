package oopVazifa;

public class Car2 {

	public String i;
	private int y;
	public Car2(String ism,int yosh) {
		this.i=ism;
		this.y=yosh;
	}
	public String tostring () {
//		System.out.printf("ismi=%s, yosh=%s",i,y); 
		return "ism="+i+"\nyosh="+y;
	}
}
