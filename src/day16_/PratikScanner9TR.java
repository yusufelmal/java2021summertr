package day16_;

import java.util.Scanner;

public class PratikScanner9TR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Girilen zamanı saniyeye çeviren bir program yazınız.


Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye


 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen saat bilgisi giriniz : " );
		int saat=scan.nextInt();
		System.out.println("Lutfen dakika bilgisi giriniz : ");
		int dakika=scan.nextInt();
		System.out.println("Lutfen saniye bilgisi giriniz : ");
		int saniye=scan.nextInt();
		
		System.out.println(saat + " saat" + dakika + " dakika" +saniye+ " saniye ==>");
		System.out.println(saat*3600+dakika*60+saniye +"saniye");
		scan.close();
	}

}
