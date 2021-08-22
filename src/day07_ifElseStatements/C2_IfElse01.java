package day07_ifElseStatements;

import java.util.Scanner;

public class C2_IfElse01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("dikdörtgenin kenarlarini yaz ve yazince enter a bas");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			
			System.out.println("girdiginiz dörgen bir kare");
			
		} else {
			
			System.out.println("girdiginiz dörgen bir dikdörtgen");
			
		}
		scan.close();
	}

}
