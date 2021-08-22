package day19_arrays;

public class C01_Arrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun
		// ve bu array’i yazdirin.

		// short arr1 []= new short[5];

		// System.out.println(arr1);
//1. yöntem		
		String isimler[] = new String[4];

		isimler[0] = "Ali";
		isimler[1] = "Veli";
		isimler[2] = "Ayse";
		isimler[3] = "Fatma";

		System.out.println(isimler[1]);

		//2. yöntem
		
		String isimler2[]= {"Ali", "Veli", "Ayse", "Fatma"};
		
		System.out.println(isimler2[1]);
		
		// veli yerine hasan yazdiralim
		
		isimler[1]="Hasan";
		
		System.out.println(isimler[1]); //hasan yazdirdi
		
		//isimler[5]="Hakan";//java 5. index in varlığını bilmiyor. syntax sorunsuz altını çizmedi bu yüzden. ama hata verir.
		
		int size=isimler.length;
		System.out.println(size);
		
		System.out.println(isimler2[1]);
		
		//tüm elemanları yazdırmak için
		//1. yol-->>
		
		for (int i = 0; i < isimler2.length; i++) {
			System.out.println(isimler2[i]);
		}
		//2. yolu ANLAMADIN
		
				
	}

}
