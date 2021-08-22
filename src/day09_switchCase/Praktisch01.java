package day09_switchCase;

import java.util.Scanner;

public class Praktisch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Problem Tanımı Bir dik üçgenin iki dik kenarını alarak hipotenüsünü
		 * hesaplayan kod yazınız. Örnek Ekran Çıktısı birinci kenar: 12 ikinci kenar: 5
		 * hipotenus: 13 kök almak için Math.sqrt(sayi) metodunu kullanınız
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("a dik kenarini giriniz: ");

		int a = scan.nextInt();

		System.out.print("b dik kenarini giriniz: ");
		int b = scan.nextInt();

		double h = Math.sqrt((a * a) + (b * b));

		System.out.println("şakşukaa: " + h);
	}

}
