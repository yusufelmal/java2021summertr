package day04_increment_matematiksel_islemler;

public class C1_IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi1 = 10;
		int sayi2 = 20;
		
		sayi1-= 5;
		sayi2+= 10;
		
		System.out.println(sayi2/sayi1);
		
		sayi1*=2;
		sayi2++;
		
		System.out.println(sayi2/sayi1);	

		sayi1/=2;
		
		double sayi3=sayi2/10;
		
		System.out.println(sayi1*sayi2);
		System.out.println(sayi1*sayi3);

		
		sayi3 = (double)sayi2/10;
		System.out.println(sayi3);
		
		sayi2+= 0.2;
		
		System.out.println(sayi2);
		System.out.println(sayi2);
		
	}

}
