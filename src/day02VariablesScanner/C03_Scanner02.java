package day02VariablesScanner;

import java.util.Scanner;

public class C03_Scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen isminizi giriniz : ");
		
		String name = scan.next();
		
		System.out.println("Lütfen soyisminizi giriniz : ");
		
		String surname = scan.next();
		
		System.out.println("İsim soyisim : " + name + " " + surname);
		
		
		scan.close();
		
			
		
		
		
	}

}
