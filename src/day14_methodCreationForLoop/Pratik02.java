package day14_methodCreationForLoop;

import java.util.Scanner;

public class Pratik02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("üç basamakli bir sayi giriniz : ");
		
		int sayi =scan.nextInt();
		
		//356 için düşün
		
		int yuzler=sayi/100;
		int onlar=(sayi/10)%10;
		int birler=sayi%10;
		
		switch (yuzler) {
		case 1: {
			System.out.println("");
			break;
		}
		case 2: {
			System.out.println("iki");
			break;
			
		}
		case 3: {
			System.out.println("üç");
			break;
		}
		case 4: {
			System.out.println("dört");
			break;
		}
		case 5: {
			System.out.println("beş");
			break;
		}
		case 6: {
			System.out.println("altı");
			break;
			
		}
		case 7: {
			System.out.println("yedi");
			break;
		}
		case 8: {
			System.out.println("sekiz");
			break;
		}
		case 9: {
			System.out.println("dokuz");
			break;
		}
		}System.out.println("yüz");
		
		switch (onlar) {
		case 1: {
			System.out.println("on");
			break;
		}
		case 2: {
			System.out.println("yirmi");
			break;
			
		}
		case 3: {
			System.out.println("otuz");
			break;
		}
		case 4: {
			System.out.println("kırk");
			break;
		}
		case 5: {
			System.out.println("elli");
			break;
		}
		case 6: {
			System.out.println("altmış");
			break;
			
		}
		case 7: {
			System.out.println("yetmiş");
			break;
		}
		case 8: {
			System.out.println("seksen");
			break;
		}
		case 9: {
			System.out.println("doksan");
			break;
		}
		}
		
		switch (birler) {
		case 1: {
			System.out.println("bir");
			break;
		}
		case 2: {
			System.out.println("iki");
			break;
			
		}
		case 3: {
			System.out.println("üç");
			break;
		}
		case 4: {
			System.out.println("dört");
			break;
		}
		case 5: {
			System.out.println("beş");
			break;
		}
		case 6: {
			System.out.println("altı");
			break;
			
		}
		case 7: {
			System.out.println("yedi");
			break;
		}
		case 8: {
			System.out.println("sekiz");
			break;
		}
		case 9: {
			System.out.println("dokuz");
			break;
		}
		}

	}

}
