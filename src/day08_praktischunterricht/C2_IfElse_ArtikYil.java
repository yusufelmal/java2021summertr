package day08_praktischunterricht;

import java.util.Scanner;

public class C2_IfElse_ArtikYil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        /*
        * Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
        * Kural 1: 4 ile bolunemeyen yillar artik yil degildir 
        * Kural 2: 4’un kati olmasina ragmen 100 ile    bolunebilen yillardan 
        *        sadece 400’un kati olan yillar artik yildir
        */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("artik yil kontrolu icin bi yil giriveriniz gariniz");
		
		int yil =scan.nextInt();
		
		if(yil %4 != 0) {
			System.out.println("bu artik yil degil");
		} else {
			if  (yil %100 ==0 && yil%400 ==0) {
				System.out.println("bu artik yil");
			} else if (yil%100== 0 && yil%400 !=0) {
				System.out.println("artik martik degil");
				
				
			} else {
				System.out.println("artik yildir");
			}
		}
	}

}
