package day04_increment_matematiksel_islemler;

public class C2_PreIncrement_PostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sayi1 = 20;
		int sayi2 = ++sayi1; 
		
		//burası preincrement, çünkü önce yazmışlar;//
		
		
		//burası da postincrement//
		
		
		System.out.println("pre_increment sayi1 : " + sayi1 );
		System.out.println("pre_increment sayi2 : " + sayi2 );
		
		sayi1++;  
		
		System.out.println(sayi1);
		
		sayi2 = sayi1++;

		System.out.println(sayi1);
		System.out.println(sayi2);
		
		int sayi3 = 10;
		
		System.out.println("deneme" + ++sayi3); // önce artır 11, sonra yazdır 11
		System.out.println("deneme" + sayi3++); // önce yazdır 11, sonra artır 12
		System.out.println(sayi3); // son bildiği değer 12
		
		

	}


}
