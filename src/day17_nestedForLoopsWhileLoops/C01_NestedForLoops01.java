package day17_nestedForLoopsWhileLoops;

import java.util.Iterator;
import java.util.Scanner;

public class C01_NestedForLoops01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("deneme");

/*
Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve 
girilen rakama gore asagidaki sekli cizdirin
*
* *
* * *
* * * * 
* * * * *

*/
Scanner scan=new Scanner(System.in);

System.out.println("bir rakam giriniz : ");

int rakam = scan.nextInt();

for (int satirNo = 1; satirNo <= rakam; satirNo++) {
	
	for (int yildiz = 1; yildiz <= rakam; yildiz+=2) {
		
		
	System.out.print("* ");
	
	
	System.out.println();
	for (int bosluk = rakam ; bosluk >= 0; bosluk--) {
		
		System.out.print("-");
		
	}
	
	}
	
	System.out.println(" ");

}
	}
}
