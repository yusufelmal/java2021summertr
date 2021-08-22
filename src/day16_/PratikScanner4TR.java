package day16_;

import java.util.Scanner;

public class PratikScanner4TR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.


1 şeker = 1.7 gr


Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor. */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gunde kac bardak cay iciyorsunuz? ");
		int a = scan.nextInt();
		System.out.println("Her bardaga kac seker atıyorsunuz? ");
		int b =scan.nextInt();
		
		System.out.println("Yılda " + a*b*365*1.7/1000 + " kg seker kullanıyor");

	}

}
