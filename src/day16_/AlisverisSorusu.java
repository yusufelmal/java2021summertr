package day16_;

import java.util.Scanner;

public class AlisverisSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin (4 girilmis)
 *
 * *
 * * *
 * * * *
 
 
 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir rakam giriniz : ");
		int rakam = scan.nextInt();
		
		for (int satirNo = 1; satirNo < rakam; satirNo++) {
			for (int i=1 ; i<=satirNo; i++) {
				
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		
		
		
	}

}
