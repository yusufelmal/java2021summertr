package day41_exceptions;

import java.util.Scanner;

public class C02_Exceptions02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 1;
		while (count <= 2) {

			System.out.println("blunen sayi veriniz");

			int sayi1 = scan.nextInt();

			System.out.println("bolen sayi gir");

			int sayi2 = scan.nextInt();

			try {
				System.out.println("bolum" + sayi1 / sayi2);

			} catch (ArithmeticException e) {

				System.out.println("bolme isleminde bolen sifir olamaz");
				System.out.println(e.getMessage());// şunu yazdırmak için: / by zero / otmatik verdi bu yazıyı
				e.printStackTrace();// bu satırı yazarsam uzun mesaj olan aşağıdaki bütün hata verisini getirir

				/*
				 * java.lang.ArithmeticException: / by zero at
				 * java2021summertr/day41_exceptions.C02_Exceptions02.main(C02_Exceptions02.java
				 * :30)
				 * 
				 */

			}

			count++;

		}

		System.out.println("bu yaziyi görüyorsan iş tamamdir.");

	}

}
