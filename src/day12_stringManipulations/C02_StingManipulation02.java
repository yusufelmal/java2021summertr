package day12_stringManipulations;

import java.util.Scanner;

public class C02_StingManipulation02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
 isim-soyisim : M***** B*******
 kart no : **** **** **** 1234
 
 
 */

		 
	 
	      
	        
	        
		Scanner scan = new Scanner(System.in);
		
		System.out.println("isminizi giriniz : ");
		
		String isim = scan.nextLine();
		
		System.out.println("soyisminizi giriniz : ");
		String soyisim =scan.nextLine();
		
		System.out.println("kredi karti no giriniz : ");
		String kkart =scan.nextLine();
		
		String isimDuzenlenmis = isim.substring(0,1).toUpperCase() +// ilk harfi büyük
				isim.substring(1).replaceAll("\\w", "*"); //ilk harften sonraki tüm harfler yıldız
		String soyisimDuzenlenmis = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\S", "*");//\\w yapsaydık da olurdu
		String kkartDuzenlenmis = "**** **** **** " + kkart.substring(15);
		
		
		System.out.println("isim soyisim : " + isimDuzenlenmis + " " +soyisimDuzenlenmis + "\nkart no :" +kkartDuzenlenmis);
		
	
		
	}

}



