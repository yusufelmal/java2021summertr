package day10_stringManipulations;

import java.util.Scanner;

public class C4_StringManipulation04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
 - Girilen kelime cumlede kullanilmamis.
 - Girilen kelime cumlede 1 kere kullanilmis.
 - Girilen kelime cumlede 1’den fazla kullanilmis.
		 */
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("bir cümle giriniz");
		String cumle =scan.nextLine().toLowerCase();
		
		System.out.println("bir kelime giriniz");
		String kelime=scan.nextLine().toLowerCase();
		
		int ilkkull = cumle.indexOf(kelime);
		int sonkull =cumle.lastIndexOf(kelime);
		
		if (ilkkull==-1) {
			System.out.println("girilen kelime cumlede kullanilmamis");
		} else if (ilkkull==sonkull){
			System.out.println("bir kez kullanilmistir");
		}else {
			System.out.println("birden fazla kullanim sozkonusu");
		}
			
		
		
		
		
		


	}

}
