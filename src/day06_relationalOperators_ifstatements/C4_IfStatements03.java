package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C4_IfStatements03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen günün ilk harfini giriniz: ");
		
		char harf = scan.next().toLowerCase().charAt(0); //char da alabilirdik ama metod yok, bu yüzden string aldık.
		
		if (harf=='p') {
			System.out.println("pzt, pşr ve pz");
	
		
		}
		
		if (harf=='s') {
			
			System.out.println("sali");
		
		}
		
		if (harf=='c')
			
			System.out.println("carsamba, cuma, cts");
		
		if (harf!= 'p' && harf!='s' && harf!='c' ) {
		
		System.out.println("lütfen geçerli bir karakter giriniz");
	
	}
		
	}		
}

