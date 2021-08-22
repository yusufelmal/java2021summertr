package day16_;

import java.util.Scanner;

public class FaktoriyelSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Soru 11. interview Question kullanicidan 10dan 
 * kücük bir tamsayi isteyin ve grilen sayinin faktoryelini 
 * bulun. (5!=5*4*3*2*1)
 * 
 * 
 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("10dan kucuk bir sayi giriniz : ");
		
		int sayi=scan.nextInt();
		
		int factorial =1;
		
		for(int i=1; i<=sayi; i++) {
			factorial*=i;
			System.out.print(sayi + "!=" + i + " " );
			
			
		}
		
		
		
		
	}

}

