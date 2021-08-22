package day14_methodCreationForLoop;

import java.util.Scanner;

public class C01_methodCreation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. 
		 * 1. Bu sayinin tek mi cift mi oldugunu, 
		 * 2. sifirdan buyuk mu kucuk mu oldugunu, 
		 * 3. ayrica ve 100’den buyukse 
		 * 3. birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 * 3. 100’den kucukse sadece 1’ler basamagini yazdiran 
		 * 3. 3 method olusturun.


		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir tam sayi yaziniz");
		int sayi=scan.nextInt();
		
		tekMiciftMiYazdir(sayi);
		sifirlaKarsilastir(sayi);
		istenenBasamaklariYazdir(sayi);
		
		scan.close();
		
		
	}

	public static void istenenBasamaklariYazdir(int sayi) {
		// TODO Auto-generated method stub
		if (sayi<100) {
			System.out.println("girdiginiz sayinin birler basamagi : " + (sayi%10));
		} else { //sayi 1345678254 olsun
			
			int rakamlarToplami=0;
			int rakam=0;
			
			rakam=sayi%10; //4
			rakamlarToplami+=rakam; //4
			sayi/=10; //  son hane gitti
			
			rakam=sayi%10; // 5
			rakamlarToplami+=rakam; // 9
			sayi/=10;
			
			rakam=sayi%10; //2
			rakamlarToplami+=rakam; //11
			sayi/=10;
			
			System.out.println(rakamlarToplami);
			
		}
		
	}

	public static void sifirlaKarsilastir(int sayi) {
		// TODO Auto-generated method stub
		
		if (sayi>0) {
			System.out.println("girilen sayi pozitif");
		} else if (sayi<0) {
			System.out.println("girilen sayi negatif");
		} else {
			System.out.println("sayi sifirdir");
		}
		
	}

	public static void tekMiciftMiYazdir(int sayi) {
		// TODO Auto-generated method stub
		if (sayi%2==0) {
			System.out.println("girilen sayi cift bir sayidir");
			
		} else {
			System.out.println("girilen sayi tek bir sayidir");
		}
	}

}
