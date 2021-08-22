package day04_increment_matematiksel_islemler;

public class C3_PreDecrement_PostDecrement {


	public static void main(String[] args) {
		
		
		int sayi1= 20;
		int sayi2 = sayi1--; //önce işlem sonra azalt. işlem sayi 1 in ilk değeri, azalt, sayi1 i azalt
		
		System.out.println("post decrement sayi 1: " + sayi1); 
		System.out.println("post decrement sayi 2: " + sayi2);
		
		System.out.println(--sayi2);
		System.out.println(sayi2--);
		System.out.println(sayi2);
		
	}

		


}
