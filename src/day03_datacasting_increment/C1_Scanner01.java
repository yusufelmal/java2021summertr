package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen ad soyad yaziniz ve \nbastiktan sonra ENTER'a basiniz. ");
		
		String name=scan.nextLine();
		String surname=scan.nextLine();
		
		System.out.println("isminiz = " + name + "\nsoyisminiz = " + surname + "\nkursumuza katiliminiz alinmistir.");
		
		scan.close();
		
	}

} 
