package day42_exceptions;

import java.util.Scanner;

public class C07_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  /*
         * Kullanicidan carpma yapmak icin bir String isteyin. Kullanicinin girdigi
         * String sadece sayilardan olusuyorsa sayiyi 2 ile carpip sonucu yazdirin.
         * Kullanici sayilardan olusmayan bir String girerse
         * "Girdiginiz String sayiya cevrilemez" yazdirin.--> hata firlatin...
         */
		
		  Scanner necati=new Scanner(System.in);
		  
		  System.out.println("bir string giriniz: ");
		  String str1=necati.nextLine();
		  
		  
		//  System.out.println(2*Integer.parseInt(str1));
		  
		  try {
			  System.out.println(2*Integer.parseInt(str1));
			
		} catch (Exception e) { //buraya NumberFormatException yazsaydık daha doğru olurdu ama her
			//türlü çıktıyı aynı şekilde düzgün veriyor.
			// TODO: handle exception
			System.out.println("hatali giriş yaptınız.");
		}
		  necati.close();
		  

	}

}
