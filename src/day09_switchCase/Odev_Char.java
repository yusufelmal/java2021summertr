package day09_switchCase;

import java.util.Scanner;

public class Odev_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2222222222222
        Kullanicidan bir character girmesini isteyiniz
     Character harf ise kucuk harf olup olmadigini kontrol ediniz
     Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
     Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
     Harf degilse ekrana "Harf degil" yazdiriniz
     97:a  122:z ascii değeri
      333333
     */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir karakter giriniz : ");
		
		char karakter = scan.next().charAt(0);
		
		if (karakter >= 'A' && karakter<'Z') {
			System.out.println("büyük harf");
			
		}else if (karakter>='a' && karakter < 'z') {
			System.out.println("kucuk harf");
		}else {
			System.out.println("harf degil");
		}
			

	}

}
