package day07_ifElseStatements;

import java.util.Scanner;

public class C7_IfElseIf03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen notunuzu giriniz");
		
		double not = scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("Lütfen gecerli bir sayi giriniz");
			
		} else if (not<50) {
			System.out.println("notunuz D");
			
		} else if (not<60) {
			System.out.println("notunuz C");
			
		} else if (not<80) {
			System.out.println("notunuz B");
		} else {
			System.out.println("notunuz A");
		}
	}

}

