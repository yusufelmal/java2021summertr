package day08_praktischunterricht;

import java.util.Scanner;

public class PraktischDrei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
         * Kullanicidan uc basamakli bir sayi alin 
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         * 
         * 
         * Ornek : Inputs : 853 
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5 
         *          Girdiginiz sayinin yuzler basamagi : 8
         * 
         * 
         */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen uc basamakli bir sayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		System.out.println();
		
		int birler =sayi%10;
		int onlar = sayi/10%10;
		int yuzler = sayi/100;
		
		System.out.println("Girdiginiz sayinin birler basamagi : " +birler);
		System.out.println("Girdiginiz sayinin onlar basamagi : " +onlar);
		System.out.println("Girdiginiz sayinin yuzler basamagi : " +yuzler);
		
	}

}
