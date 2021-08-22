package day02VariablesScanner;

import java.util.Scanner;

public class hauaufgabeheute {

	
	public static void main(String[] args) {
	
		String grüsse = "Selam";
		
		System.out.println(grüsse);
		
		int number = 32;
		
		System.out.println(number);
		
		System.out.println("gegebene number : " + number);
		
		boolean wasPassiert = false;
		
		System.out.println("noolmus : " + wasPassiert);
		
		String add = "Osmaniye";
		String namme = "nuriye";
		
		System.out.println("adiniz = "+add);
		System.out.println("soyadiniz = "+ namme);
		
		int nm1 = 8;
		int nm2 = 12;
		
		System.out.println(nm1+nm2);
		
		System.out.println("iki sayinin toplamı = "+(nm1+nm2));
		
		int nm3 = 14;
		double nm4 = 28.4;
		
		System.out.println("virgüllü toplam = " +(nm3+nm4));
		
		char kar = 'X';
		int nm5 = 12;
		
		System.out.println(kar+nm5);
		
	Scanner necati = new Scanner (System.in);
		
		System.out.println("bana veri ver = ");
		
		int sayi9 = necati.nextInt();
		int sayi10 = necati.nextInt();
		System.out.println("toplam alalim = " +(sayi9+sayi10));
		
		necati.close();
	}

}
