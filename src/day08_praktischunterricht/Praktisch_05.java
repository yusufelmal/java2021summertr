package day08_praktischunterricht;

import java.util.Scanner;

public class Praktisch_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
	      * Kullanicidan alacaginiz vize2 vize2 ve final notlarini 
	      * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
	      */
		
		/*deneme
		 * sene 
		 * fsakngfa
		 * aefknerfk
		 * misis
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Vize 1 notunuzu giriniz: ");
		
		double vize1 = scan.nextDouble();
		
		System.out.print("Vize 2 notunuzu giriniz: ");
		
		double vize2 = scan.nextDouble();
		
		System.out.print("Final notunuzu giriniz: ");
		double finalNotu = scan.nextDouble();
		
		
		double gecmeNotu = (vize1+vize2)/2*.3+finalNotu*.7;
		
		System.out.println("gecme notunuz: " + gecmeNotu);

	}

}
