package geometry;
import java.util.Scanner;
public class GeometryMain {
	public static void main(String ar[]) {
		GeometricFigure gm = new GeometricFigure();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			if (count == 2) {
				break;
			}
			System.out.println(
					"\nUchburchak yuzasi uchun->1 \nTrapetsiya yuzasi uchun->2; \nTo'rtburchak yuzasi uchun->3;\nShakllar perimetrini hisoblash uchun->4;");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("\nUchburchak yuzasini topish uchun uning barcha tomonlari kiriting.");
				int a, b, c;
				System.out.print("1-tomoni: ");
				a = sc.nextInt();
				System.out.print("2-tomoni: ");
				b = sc.nextInt();
				System.out.print("3-tomoni: ");
				c = sc.nextInt();
				gm.Uchburchakyuzasi(a, b, c);
				count++;
			} else if (choice == 2) {
				int a, b, c;
				System.out.println(
						"Trapetsiya yuzini topish uchun uning katta va kichik asoslarini va balandligini kiriting;");
				System.out.print("Katta asosini kiriting: ");
				a = sc.nextInt();
				System.out.print("Kichik asosini kiriting: ");
				b = sc.nextInt();
				System.out.print("Balandlikni kiriting: ");
				c = sc.nextInt();
				gm.trapetsiyayuzi(a, b, c);
				count++;
			} else if (choice == 3) {
				int a, b, c;
				System.out.println("To'rtburchak yuzasini topish uchun uning kalta va uzun tomonlarini kriting;");
				System.out.print("Kalta tomonni kiriting: ");
				a = sc.nextInt();
				System.out.print("Katta tomoni kiriting: ");
				b = sc.nextInt();
				gm.tortburchakyuzi(a, b);
			} else if (choice == 4) {
				ShaklPerimetri p = new ShaklPerimetri();
				p.UchburchakPerimetri(8, 6, 4);
				p.TrapetsiyaPerimetri(8, 2, 8, 5);
				p.TortburchakPerimetri(8, 6);
				count++;
			}
		}

	}
}
