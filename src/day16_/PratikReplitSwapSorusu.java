package day16_;

import java.util.Scanner;

public class PratikReplitSwapSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

int a= 3;

int b= 5;

Ornek Cikti: 

a=5

b=3
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("bir harf ya da rakam yaziniz : ");
		String a= scan.next();
		
		System.out.println("bir harf ya da rakam daha veriniz : ");
		String b= scan.next();
		
		String takas= "0";
		
		System.out.println("takastan once: ");
		System.out.println("Deger 1 = " + a);
		System.out.println("Deger 2 = " + b);
	
		takas = a;
		a=b;
		b=takas;
		
		System.out.println("takastan sonra : ");
		System.out.println("Deger 1 = " + a);
		System.out.println("Deger 2 = " + b);
		
		
		
		
		
		
		

	}

}
