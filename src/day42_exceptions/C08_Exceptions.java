package day42_exceptions;

import java.util.Scanner;

public class C08_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//kullanicidan yasini girmesini isteyin. kodunuzu kullanıcı sıfırdan
		// kucuk bi sayi girerse exception verecek şekilde yazın.

		Scanner osman = new Scanner(System.in);
		System.out.println("sayi giriniz. ");

		int age = osman.nextInt();

		/*
		 * if(age<0) { 
		 * throw new IllegalArgumentException(); 
		 * } else {
		 * System.out.println(age); }
		 */ // try catch öncesi versiyon yukarısı

		try {
			if (age >= 0) {
				System.out.println(age);

			} else {
				throw new IllegalArgumentException();
			}

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		System.out.println("kod buraya kadar gelmişse olmuştur");
	}
}
//bu alttaki versiyon ile olunca kod kırılmadı. yukarda kod kırıldı. 

