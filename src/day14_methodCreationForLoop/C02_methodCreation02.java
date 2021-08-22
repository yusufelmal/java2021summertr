package day14_methodCreationForLoop;

import java.util.Scanner;

public class C02_methodCreation02 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Kac sayi toplamak istersiniz? ");
		
		int adet=scan.nextInt();
		
		if (adet<2) {
			System.out.println("en az iki sayi giriniz : ");
		} else if (adet==2) {
			ikiSayiTopla();
		} else if (adet==3) {
			ucSayiTopla();
		}  else if(adet==4) {
			dortSayiTopla();
		} else {
			System.out.println("cok sayi girdiniz, olmas");
		}
		scan.close();
	}

	private static void dortSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen dort tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		int sayi4=scan.nextInt();
		System.out.println("sayilarin toplami = " +(sayi1+sayi2+sayi3+sayi4));
				scan.close();
	}

	private static void ucSayiTopla() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen uc tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		System.out.println("sayilarin toplami = " +(sayi1+sayi2+sayi3));
		scan.close();
	}

	public static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
System.out.println("lutfen iki tam sayi giriniz");
int sayi1=scan.nextInt();
int sayi2=scan.nextInt();
System.out.println("sayilarin toplami = " +(sayi1+sayi2));
		scan.close();
	}
}


