package day16_;

import java.util.Scanner;

public class PratikScanner8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Kullanıcıdan üç basamaklı bir sayı girmesini 
 * ve bu sayının basamaklarının toplamını bulmasını isteyin.
   
   Örnek Çıktı:

   Verilen tamsayının rakamları toplamı 10'dur.
 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine dreistellige Zahl ein : ");
		
		int sayi=scan.nextInt();
		
		int bas1= sayi%10;
		int bas2= sayi/10%10;
		int bas3=sayi/100;
		
		System.out.println("Verilen tamsayinin rakamlari toplamı " + (bas1+bas2+bas3) + "'dur. ");
		
		
	}

}
