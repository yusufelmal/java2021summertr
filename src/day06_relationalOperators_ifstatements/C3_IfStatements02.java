package day06_relationalOperators_ifstatements;

import java.util.Scanner;



public class C3_IfStatements02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz : ");
		
		int girilenSayi = scan.nextInt();
		
		if (girilenSayi%2==0) {
		System.out.println("sayi cifttir");
		}
		
		if (girilenSayi%2==1) {
			
		System.out.println("sayi tektir");
		
		}
		if (girilenSayi<0) {
		    System.out.println("Lutfen pozitif bir tamsayi girin");
		}
	}

}
