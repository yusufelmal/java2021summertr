package day11_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Soru 1) Kullanicidan email adresini girmesini isteyin, 
		 * mail @gmail.com iceriyorsa   “Email adresiniz kaydedildi”, 
		 * icermiyorsa “Lutfen gmail mail adresinizi giriniz.. “ yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen mail adresinizi giriniz");
		String mail=scan.nextLine();
		
		// aa@gmail@gmail.com seklinde girildiginde hata veren kodu yaziniz
		
		if (mail.indexOf("gmail.com")!=-1) {
			if (mail.lastIndexOf("@gmail")== mail.indexOf("@gmail")) {
				System.out.println("Email adresiniz kaydedildi");
			}else {
				System.out.println("Lutfen gecerli gmail adresinizi giriniz..");
			}
		}else {
			System.out.println("Lutfen gecerli gmail adresinizi giriniz..");
		}

		scan.close();
		

	}

}
