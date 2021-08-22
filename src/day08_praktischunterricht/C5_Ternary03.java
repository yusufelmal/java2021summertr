package day08_praktischunterricht;

import java.util.Scanner;

public class C5_Ternary03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// bi sayi al ve mutlak değerini yazdir
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz");
		
		double sayi=scan.nextDouble();
	
		
		System.out.println(sayi>0 ? sayi : -1*sayi);
		
		//if ile yapmak isteseydik
		
		if (sayi>0) {
			System.out.println("girdiginiz sayinin mutlak degeri : " + sayi);
			
		} else {
			System.out.println("girdiginiz sayinin mutlak degeri : " + sayi);
		}
		//acıklama girin dese ternary kullanamazsın. bunu ifte yapabilirsin. cokomeli
		
		scan.close();
		
	}

}
