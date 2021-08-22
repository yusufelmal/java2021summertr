package day08_praktischunterricht;

public class C3_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi = 50;
		
		//variable olmalı bura   //		string		string
		String sonuc = sayi%2 == 0 ? "Sayi cift" : "Sayi tek";
		//			bura boolean      true ise		false ise
		//			olmK zorunda
			
			System.out.println(sonuc);
			
		System.out.println(sayi>100 ? "Sayi 100den buyuk" : 10);
		
		//direk yazdırınca cinsleri aynı olmak zorunda değil, biri string biri int. işliyor
		
		
		//System.out.println sayi>100 ? "Sayi 100den buyuk" : 'a';
		//farklı data türündeki sonuclar için atama yapamayız
		
		int y = 1;
		int z = 1;
		int a = y<10 ? y++ : z++;
		
		System.out.println(y + "," + z + "," + a);
	}

}
