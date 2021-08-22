package day20_arrays;

public class PratikHalHo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	       sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
	       DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.
	       Problem Tanımı
	        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
	         Ekran Çıktısı
	        91
	        78
	        65
	        52
	        39
	        26
	        13       */
		
		/*sonradan ekleme: toplamlarını da alın*/
		
		int top=0;
			
		for (int i = 100; i > 0; i--) {
			if(i%13==0) {
				System.out.print(i+ " ");
				top+=i;
				
			}
		}
		System.out.println();
		System.out.println("toplam: " + top);
	}

}
