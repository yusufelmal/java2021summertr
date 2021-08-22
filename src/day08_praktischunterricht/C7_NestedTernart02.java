package day08_praktischunterricht;

import java.util.Scanner;



public class C7_NestedTernart02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Soru4 ) Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen degerlere  gore dikdorgenin kare olup olmadigini yazdirin.


		Scanner scan = new Scanner (System.in);
		
		System.out.println("Dikdörtgenin kenar uzunluklarini giriniz");
		
		double sayi1= scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println(sayi1<=0 || sayi2<=0 ? "Lutfen gecerli uzunluk giriniz" : sayi1==sayi2 ? "Kare" : "Kare değil");

     
		
		scan.close();
	}

}          
