package day08_praktischunterricht;

import java.util.Scanner;

public class C6_NestedTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam” , değilse ve 100’den kucukse “iki basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin


		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir tam sayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		System.out.println(sayi<10 ? "Rakam" : (sayi<100 ? "iki basamakli sayi" : "uc basamakli ya da daha buyuk"));
		
		scan.close();
		

	}

}
