package day43_exceptions;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws BenimHataMesajimException {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("email giriniz: ");
		String email=scan.next();
		
		if (email.contains("@gmail.com")||email.contains("@hotmail.com")) {
			System.out.println("basarili");
		} else {
			throw new   BenimHataMesajimException("neyin kafasi bu");
			
			
		}
	}
}
