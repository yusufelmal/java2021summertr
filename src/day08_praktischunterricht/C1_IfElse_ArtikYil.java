package day08_praktischunterricht;

import java.util.Scanner;

public class C1_IfElse_ArtikYil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen artik yil kontrolu icin bi yil giriniz: ");
		
		int yil = scan.nextInt();
		
		if (yil%4 != 0) {
			
			System.out.println("Girdiginiz yil artik yil degil");
		} else if (yil %100 != 0) {
			
			System.out.println("girdiginiz yil artik yildir");
			
			
		} else if (yil %400 == 0) {
			
			System.out.println("bu yil artik yildir");
		} else {
			
			System.out.println("artik yil degil");
		}
	}
}
