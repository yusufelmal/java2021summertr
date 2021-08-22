package day41_exceptions;

import java.util.Scanner;

public class C01_Exceptions01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kullancidan alınan iki sayinin bölümünü yazin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("blunen sayi veriniz");
		
		int sayi1=scan.nextInt();
		
		System.out.println("bolen sayi gir");
		
		int sayi2=scan.nextInt();
		
		try {
			System.out.println("bolum" + sayi1/sayi2);
			
			
		}catch(ArithmeticException e) {
			
			System.out.println("bolme isleminde bolen sifir olamaz");
		}

	}

}
