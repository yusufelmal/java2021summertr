package day04_increment_matematiksel_islemler;

public class C4_Modulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi = 5496;
		int rakamlarToplami = 0;
		//1
		int rakam = sayi%10;
		
		rakamlarToplami+= rakam;
		
		sayi /=10;
		//2
		rakam = sayi%10;
		
		rakamlarToplami+= rakam;
		
		sayi /=10;
		//3
		rakam = sayi%10;
		
		rakamlarToplami+= rakam;
		
		sayi /=10;
		//4
		rakam = sayi%10;
		
		rakamlarToplami+= rakam; //bununla rakamı 24 ledik
		
		sayi /=10; //bununla sayiyi sıfırladık.
		
		System.out.println(rakamlarToplami);
		System.out.println(sayi);
				
				
	}

}
