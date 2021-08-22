package day16_;

import java.util.Scanner;

public class PratikScanner6TR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("bir float degeri giriniz : ");
		
		float num=scan.nextFloat();
		
		short num1=(short)num;
		
		System.out.println(num1);
		scan.close();
	}

}


