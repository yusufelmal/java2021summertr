package day05_Wrapper_Cocenation;

public class C1_WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String isim= "Yusuf";
		int sayi=10;
		
		System.out.println(isim.charAt(2));
		
		//isim. denince bi sürü metod geliyor. çünkü non primitivdir. 
		//sayi. denince tık yok. çünkü int primitivdir.
		//primitivlerde sadece value vardır, ama nonprimitivlerde hem value hem metodlar vardır. 
		
		Integer sayi2=10; //int yerine Integer yazınca artık metodlar akıyor. artık bu primitiv değil non primitiv oldu. 
		//işte bu olaya "javanın her data türü için Wrapper klass ı oluşturması" denir
		
		System.out.println(sayi2.MAX_VALUE);
		System.out.println(sayi2.MIN_VALUE);
		System.out.println(sayi2.SIZE);
		System.out.println(sayi2.BYTES);
		System.out.println(sayi2.TYPE);
		
		Short zort= 35;
		
		System.out.println(zort.MAX_VALUE);
		System.out.println(zort.MIN_VALUE);
		System.out.println(zort.SIZE);
		System.out.println(zort.BYTES);
		
		//aşağıdaki örnek şunun için verildi. okul nolarını normalde string olarak yazarız nasılsa işlem yapmayacağımız için
		//ama her okul no sunu 1 artırmak gerektiğinde tek tek uğraşmayız ve aşağıdaki gibi bi kod yaparak tüm stringleri
		//int a çeviririz.
		
		String okulNo ="858";
		
		int okulNoSayiOlarak = Integer.parseInt(okulNo);
		
		// System.out.println(okulNo++); --okul no string olarak tanımlandığı için matematiksel işlem yapılamaz--
		
		System.out.println(++okulNoSayiOlarak);
		 
		Character basHarf= 'a';
		System.out.println(basHarf.charValue());
		System.out.println();

	}

}
