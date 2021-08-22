package day09_switchCase;

import java.util.Scanner;

public class Odev_0_10_arasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 11111111111
        Kullanicidan bir sayi aliniz
        Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */
		
	
		
		
	Scanner scan=new Scanner(System.in);
	System.out.print("bir sayi veriniz : ");
	
	int sayi=scan.nextInt();
	
	if (sayi>= 0 && sayi<10) {
		
		System.out.println("Rakam");
		
	} else if (sayi>0){
		System.out.println("Pozitif Sayi");
		
	} else {
	
		System.out.println("negatif sayi");
	}
	
	}

}
