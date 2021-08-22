package day07_ifElseStatements;

import java.util.Scanner;



public class C1_IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen gun ismini giriniz: ");
		
		int flag = 0;
		
		String gunIsmi=scan.next().toLowerCase();
		
		if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || 
				gunIsmi.equals("cuma") || gunIsmi.equals("persembe")) {
			
			System.out.println("girdiginiz gun haftaici");
			flag++;
			
		}
		
		if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
			
			System.out.println("girdiginiz gun haftasonu");
			flag++;
		}
		
		if (flag==0) {
			System.out.println("lütfen gecerli bir gün ismi yaziniz");
		}
		
	}

}
