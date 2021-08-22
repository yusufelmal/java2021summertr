package day15_forLoop;

import java.util.Scanner;

public class C09_ForLoop08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Soru 11 ) Interview Question Kullanicidan 10’den kucuk bir sayi isteyin ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen 10dan kucuk pozitif bir tam sayi girin");
		
		int sayi = scan.nextInt();
		
		int faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
			
		}
		System.out.println("girdiginiz sayinin faktoriyeli :" + faktoriyel);
		
		// kullanici 5 girdiyse bu işlemin sonunda 1*2*3*4*5 =120 yaziralim
	}

}
