package day09_switchCase;

import java.util.Scanner;

public class P04_ucgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Kullanicidan 3 tene pozitif tam sayi alniz. bu uc sayinin ucgen olusturma
		 * durumunu kontrol ediniz eger ucgen olabiliyor ise, es kenar ucgen olma
		 * durumunu da kontrol edniz
		 * 
		 * üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi
		 * iki kenar farkı diger kenardan büyük olmali a+b>c>a-b a+c>b>a-c b+c>a>b-c
		 * a=b=c ise es kenar ucgen
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("a kenarini giriniz: ");

		int a = scan.nextInt();

		System.out.println("b kenari: ");
		int b = scan.nextInt();

		System.out.println("ce kenari: ");
		int c = scan.nextInt();

		if (a + b > c && a - b < c && a + c > b && b > a - c && b + c > a && a > b - c) {

			if (a == b && b == c) {
				System.out.println("ucgeniniz eskenar");

			} else {
				System.out.println("sisteminiz eskenar degil");
			}
		} else {
			System.out.println("bu bir ucgen degil");
		}
	}

}
