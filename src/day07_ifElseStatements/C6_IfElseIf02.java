package day07_ifElseStatements;

import java.util.Scanner;

public class C6_IfElseIf02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen gun ismini giriniz: ");
		
		
		String gunIsmi=scan.next().toLowerCase();
		
		if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || 
				gunIsmi.equals("cuma") || gunIsmi.equals("persembe")) {
			
			System.out.println("girdiginiz gun haftaici");
			
		}
		
		else if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
			
			System.out.println("girdiginiz gun haftasonu");
		}
		
		else {
			System.out.println("lütfen gecerli bir gün ismi yaziniz");
		}
		
		
	}

}
