package day08_praktischunterricht;

import java.util.Scanner;

public class Praktisch06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *  
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("5 basamakli bir sayi giriniz:");
		
		int sayi = scan.nextInt();
		
		int sayi1 = sayi/1000;
		int sayi2 = sayi%100;
		
		int ilkIkiSayininToplami = sayi1/10 + sayi1%10;
		int sonIkiSayininToplami = sayi2/10 + sayi2%10;
		
		System.out.println("Aradiginiz toplam: " + (ilkIkiSayininToplami+sonIkiSayininToplami));
		
	}
	

}
