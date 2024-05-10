package oopVazifa;

import java.util.Scanner;

public class Point2 {
	
	public static void main (String []ar) {
		Point p = new Point();
		Scanner sc = new Scanner(System.in);
		System.out.print("Kordinata x qiymatini kiriting: ");
		p.setX(sc.nextInt());
		System.out.print("Kordinata y qiymatini kiriting: ");
		p.setY(sc.nextInt());
		System.out.print("Kordinata z qiymatini kiriting: ");
		p.setZ(sc.nextInt());
		p.kordinatalar();
	}

}
