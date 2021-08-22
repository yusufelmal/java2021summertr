package day15_forLoop;





public class C02_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10dan 20ye kadar olan sayilari yazdıran bir loop oluşturalım

		for (int i=10; i<=20; i++) {
			System.out.print(i+" "); //ln i silersen yan yana, silmezsen alt alta yazdırır
			
		// 100 ile 200 dahil aralarindaki 10 ile bölümebilen sayilari yazdirin
		}
		System.out.println("");
		for (int i = 100; i<=200; i+=10) {
			System.out.print(i + " ");
		}
		
		//50den 20ye kadar sinirlar dahil 3er 3er geri sayarak yazdiralim
		System.out.println("");
		for (int i=50; i>=20; i-=3) {
			System.out.print(i+ " ");
		}
		
		//50 ile 100 arasında 3 ile bölünebilen sayilari yazdırın.
		
		System.out.println("");
		for (int i = 50; i <=100; i++) {
			if (i%3==0) {
				System.out.print(i+ " ");
			}
		} 
		
		System.out.println("");
		for (int i = 10; i < 0; i++) {
			System.out.println(i+ " ");
			
		}
			System.out.println("son forloop un sonrasi");
			
		}
	}


