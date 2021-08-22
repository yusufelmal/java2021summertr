package day16_;

import java.util.Scanner;

public class PratikScanner3TR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 	Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

		Örnek Çıktı:

		Alan: 32

		Çevre: 24
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir dikdortgen icin iki kenar uzunlugu veriniz : ");
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		
		System.out.println("Dikdortgenin cevresi = " + 2*kenar1*kenar2 + " Dikdortgenin alani = " + kenar1*kenar2);
	}

}
