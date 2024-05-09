package oopVazifa;

import java.util.Scanner;

public class person2 {
   
	public static void main (String ar[]) {
		person p = new person();
		Scanner sc = new Scanner(System.in);
		System.out.print("Name:");
		p.setName(sc.next());
		System.out.print("Age:");
		p.setAge(sc.nextInt());
		System.out.print("email:");
		p.setEmail(sc.next());
		System.out.print("country:");
        p.setCountry(sc.next());
        sc.close();
//        p.re();
     	   System.out.print(p.name+"\n"+p.age+"\n"+p.email+"\n"+p.country);
     	   
	}
}
