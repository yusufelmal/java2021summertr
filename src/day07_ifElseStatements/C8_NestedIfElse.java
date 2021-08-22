package day07_ifElseStatements;

import java.util.Scanner;

public class C8_NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cinsiyet ve yaş alıp ona göre yaş kırılımında emekli olup olmama durumu
		
		Scanner scan=new Scanner (System.in);
		
		//S
		System.out.println("Cinsiyetinizi giriniz\nErken için E, Kadın için K giriniz");
		
		char cinsiyet = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Yasinizi giriniz");
		
		int yas = scan.nextInt();
		
		if (cinsiyet=='K') {//kadınsa
			
			if (yas>=60) {
				System.out.println("emekli olabilirsin");
				
			} else {
				System.out.println("emekli olamazsin \nDaha " + (60-yas) + " yil calismalisin");
			}
			
			
		} else if (cinsiyet=='E'){//erkekse
			
			if (yas>=65) {
				System.out.println("emekli olabilirsin");
				
			} else {
				System.out.println("emekli olamazsin. \nDaha " + (65-yas) + " yil calismalisin");
			}
			
			
		} else {
			
			System.out.println("Lütfen bilgiyi dogru giriniz");
			
			
		}
	}

}
