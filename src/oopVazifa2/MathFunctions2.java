package oopVazifa2;

import java.util.Scanner;

public class MathFunctions2 {

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		while (true) {
			if (counter >= 2) {
				break;
			}
			System.out.print(
			"Doira radiusini aniqlash uchun 1 ni,  " 
			+ "\nUchburchak yuzini aniqlash uchun 2 ni, "
			+ "\nSonni darajaga ko'tarish amali uchun 3 ni bosing: ");

			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Doira raidiusini kiriting: ");
				MathFunctions.setR(sc.nextDouble());
				MathFunctions.doirayuzasi();
				counter++;
			}

			if (choice == 2) {
				System.out.println("\nUchburchak yuzasini topish uchun uning barcha tomonlari kiriting.");
				double a, b, c;
				System.out.print("1-tomoni: ");
				a = sc.nextDouble();
				System.out.print("2-tomoni: ");
				b = sc.nextDouble();
				System.out.print("3-tomoni: ");
				c = sc.nextDouble();
				MathFunctions.Uchburchakyuzasi(a, b, c);
				counter++;
			} 
			if(choice==3) {
				System.out.println("Darajaga ko'tarish uchun sonni va uning darajasini kiriting");
				int a;
				int b;
				System.out.println("Sonni yoki raqamni kiriting: ");
				a=sc.nextInt();
				System.out.println("Darajani kiriting: ");
				b=sc.nextInt();
				MathFunctions.darajagakotarish(a,b);
				counter++;
			}
			else {
				System.out.println("Mavjud bo'magan amal;");
				break;

			}
		}
	}

}
