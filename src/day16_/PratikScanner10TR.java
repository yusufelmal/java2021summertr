package day16_;

import java.util.Scanner;

public class PratikScanner10TR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün 
 * sayısına dönüştürmek iin bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür

 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dakika giriniz : ");
		
		double dakika=scan.nextDouble();
		
		cevirici(dakika);
		
		osman(dakika);
		
		
		
		
		
	}

	private static void osman(double dakika) {
		// TODO Auto-generated method stub
		
	}

	public static void cevirici(double dakika) {

		
		
		double gun= dakika/24/60;
		int yil=(int)gun/365;
		
		int kalyil=(int)gun%365;
		
		System.out.println(dakika + " dakika yaklaşık " + yil + " yıl " +kalyil+" gündür");
	}

}
