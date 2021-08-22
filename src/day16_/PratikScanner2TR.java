package day16_;

import java.util.Scanner;

public class PratikScanner2TR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

		Ornek Cikti :

		Alan: 9

		Cevre: 12 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir kare icin kenar uzunlugu veriniz");
		
		int a=scan.nextInt();
		System.out.println("karenin cevresi = " + 4*a + " karenin alani = " + a*a);
		
	}

}
