package day15_forLoop;

import java.util.Scanner;

public class C05_ForLoop04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya 
		//kadar 3’un veya 5”in kati olan sayilari yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("100den kucuk bir tamsayi giriniz");
		
		 int sayi=scan.nextInt();
	        
	        for(int i=1 ; i<sayi ; i++) {
	            if(i % 3 == 0 && i % 5 == 0) {
	                System.out.print(i + " ");
	            }

	}scan.close();

	}
}
