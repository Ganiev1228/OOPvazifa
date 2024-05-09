package oopVazifa;

import java.util.Scanner;

public class Uchburchak {
	public static void main(String ar[]) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Gipotenuzani kiriting: ");
		a = sc.nextInt();
		System.out.print("Katet1 uzunligi kiriting: ");
		b = sc.nextInt();
		System.out.print("Katet2 uzunligi kiriting: ");
		c = sc.nextInt();
		if (a * a == (b * b) + (c * c)) {
			System.out.print("Ushbu uchburchak to'g'ri burchakli uchburchak");
		} else {
			System.out.print("Ushbu uchburchak to'g'ri burchakli uchburchak emas");
		}
	}

}
