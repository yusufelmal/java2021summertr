package day13_methodCreation;

public class C1_MethodCreation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*bir metodu oluşturmak o metodu çalıştırmak için yeterli değildir
		 * metodu çalıştırmak için onu method call--çağırmak gerekir
		 * 
		 * bunun için metodun adı ve varsa parametreleri yazılmalıdır
		 * 
		 * 
		 * 
		 */
toplama(20,40);
toplama(3,5);
System.out.println(toplama(15,20));
System.out.println(toplama(2,4));
//int sonuc=toplama(10,15);

	}

	public static int toplama(int sayi1, int sayi2) {
		
		//System.out.println("method calismadi cunku onu kullanmadim henuz, "
		//		+ "ama metodun arasına bunu yazdığım için "
		//		+ "yukarda her kullandığım zımbırtıdan sonra bu metin tekrarlıyor");
		
		//System.out.println("deneme");
		return sayi1+sayi2;
		
	}

}
