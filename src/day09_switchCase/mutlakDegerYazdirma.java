package day09_switchCase;

import java.util.Scanner;

public class mutlakDegerYazdirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * kullanıcı tarfından girilen bir sayının mutlak değerini yazdırmak için
		 * program
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("bir sayi giriniz: ");

		int sayi = scan.nextInt();

		if (sayi < 0) {
			sayi *= (-1);
		}

		System.out.println("sayinizin mutlak degeri : " + sayi);

	}

}
