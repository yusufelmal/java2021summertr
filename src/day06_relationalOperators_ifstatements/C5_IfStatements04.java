package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C5_IfStatements04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("lütfen kenar uzunluklarından birini tam sayı olarak giriniz");
		
		int kenar1 = scan.nextInt();
		
		System.out.println("lütfen diğer kenar uzunluğunu tam sayı olarak giriniz");
		
		int kenar2 = scan.nextInt();
		
		if (kenar1==kenar2){
			System.out.println("aferim bu bi kare");
			
		}
		
		if (kenar1!=kenar2){
			System.out.println("neinn davutt");
			
		}
		
		
		
	}

}
