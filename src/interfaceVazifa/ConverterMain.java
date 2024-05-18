package interfaceVazifa;

import java.util.Scanner;

public class ConverterMain {

	public static void main(String ar[]) {
		BaseConverter bs = new BaseConverter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Selsiyni farengeytga o'zgartirish uchun selsiyni kiriting: ");
		System.out.println(bs.selsToFaren(sc.nextInt()));

		System.out.println("Selsiydan Kelvin qiymatga o'giruvchi converter.");
		System.out.println("Selsiy qiymatini kiriting: ");
		System.out.println(bs.selstokelv((sc.nextInt())));
	}

}
