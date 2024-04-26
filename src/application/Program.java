package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many rooms will be rented");
		int n = sc.nextInt();
		Rent[] re = new Rent[10];
		
		for(int x=1; x<=n;x++) {
			System.out.printf("Rent #"+x+":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Room: ");
			int room = sc.nextInt();
			re[room]=new Rent(name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for(int x=1; x<re.length;x++) {
			if(re[x] != null) {
				System.out.printf(x+": ");
				System.out.println(re[x]);
			}
			
		}
		
		
		
		 

		sc.close();
	}

}
