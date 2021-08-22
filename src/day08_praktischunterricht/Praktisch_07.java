package day08_praktischunterricht;

import java.util.Scanner;

public class Praktisch_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        Kullanicidan kilosunu ve boyunu alip
        Vucut kitle indeksini hesaplayan bir program yaziniz.
        Ipucu : Vucut 
        Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
        ORNEK:
        INPUT      : Kilo: 71
                          Boy: 1,72
        OUTPUT  : Vucut Kitle Indeksiniz : 23
            */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Kilonuzu giriniz : ");
		double kilo = scan.nextDouble();
		
		System.out.print("Boyunuzu cm giriniz : ");
		double boy = scan.nextDouble();
		boy/=100;
		
		double bmi= (kilo)/(boy*boy);
		System.out.print("BMI indeksiniz: " + bmi);
		
				
		
	}

}
