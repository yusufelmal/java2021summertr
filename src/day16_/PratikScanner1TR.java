package day16_;

import java.util.Scanner;

public class PratikScanner1TR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi veriniz");
		
		int sayi=scan.nextInt();
		
		System.out.println(sayi*sayi*sayi/2);

	}

}
