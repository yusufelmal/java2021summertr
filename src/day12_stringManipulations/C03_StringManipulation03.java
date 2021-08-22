package day12_stringManipulations;

import java.util.Scanner;

public class C03_StringManipulation03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
 - Ilk harf buyuk harf olmali
 - Son harf kucuk harf olmali
 - Sifre bosluk icermemeli
 - Sifre uzunlugu en az 8 karakter olmali
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen bir sifre giriniz : ");
		
		String sifre = scan.nextLine();
		
		boolean ilkHarfKont=sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
		boolean sonHarfKont= sifre.charAt(sifre.length()-1)>='a' &&
				sifre.charAt(sifre.length()-1)<='z';
		boolean spaceKontrol = !sifre.contains(" ");
		//basa ! koyunca space olmadığında true dönsün diye
		
		boolean uzunlukKontrol =sifre.length()>=8;
		
		
		
		if ( ilkHarfKont && sonHarfKont && spaceKontrol && uzunlukKontrol) {
			System.out.println("sifre okdir");
		} else { 
			System.out.println("olmadi dost");
		}
		scan.close();
		

	}

}
