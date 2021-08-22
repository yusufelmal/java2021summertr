package day09_switchCase;

import java.util.Scanner;

public class Odev_Letztes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		
		Scanner scan=new Scanner(System.in);
		System.out.print("bir sayi giriniz : ");
		
		int sayi=scan.nextInt();
		
		if (sayi>=100 && sayi<1000) {
			System.out.println("sayi uc basamakli");
		} else {
			if (sayi%2==0) {
				System.out.println("bu uc basamakli olmayan bir cift sayidir");
			} else {
				System.out.println("bu uc basamakli olmayan bir tek sayidir");
				
			}
		}
		
	}

}
