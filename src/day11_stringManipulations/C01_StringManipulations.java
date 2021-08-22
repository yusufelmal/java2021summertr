package day11_stringManipulations;

import java.util.Scanner;

public class C01_StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Kullanicidan bir cumle ve bir kelime alin, cumlede kelimenin
		//kullanilip kullanilmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz : ");
		String cumle= scan.nextLine();
		
		System.out.println("Lütfen bir kelime giriniz : ");
		
		String kelime = scan.next();
		
		//indexof kullanimi
		
		if (cumle.indexOf(kelime)!=-1) {
			System.out.println("kelime kullanilmis");
		} else {
			System.out.println("kelime kullanilmamis");
			
		}
		
		// contains kullanimi
		
		if(cumle.contains(kelime)) { //zaten boolean olduğu için true false dönecek tekrar sormuyorum şöyle mi böyle mi diye. 
			System.out.println("kelime var");
		} else {
			System.out.println("yooh");
		}
	}

}
