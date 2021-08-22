package day08_praktischunterricht;

import java.util.Scanner;

public class C4_Ternary02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// kullanıcıdan 2 sayı al ve büyük olmayanı yazdır
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen iki sayi giriniz");
		
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		System.out.println( sayi1>sayi2 ? sayi2 : sayi1);
	}

}
