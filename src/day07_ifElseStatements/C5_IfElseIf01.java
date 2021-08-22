package day07_ifElseStatements;

import java.util.Scanner;

public class C5_IfElseIf01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan=new Scanner(System.in);
		
		System.out.println("dikdörtgenin kenarlarini yaz ve yazince enter a bas");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1<=0 || kenar2<=0) {
			
			System.out.println("lütfen geçerli bir sayi giriniz");
			
		} else if (kenar1 == kenar2) {
			
			System.out.println("bu bir dörtgen cinsi olan karedir"); 
			
		} else {
			
			System.out.println("bu bir kare degildir");
		}

	}

}
