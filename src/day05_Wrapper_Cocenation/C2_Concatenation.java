package day05_Wrapper_Cocenation;

public class C2_Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="Hallo";
		String str2="World";
		int sayi1 = 3;
		int sayi2 = 4;
		
		System.out.println(str1 + (sayi2-sayi1));
		System.out.println(str1 + " " + ((sayi2*2) - sayi1) + " " + str2);
		//yukardaki satıra alternatif
		System.out.println(str1+" "+ ++sayi2 +" "+ str2);
		
		System.out.println(str1 + " " + sayi1 + --sayi2);
		
		System.out.println(sayi1+sayi2 + str2);
		
		System.out.println(sayi1+""+sayi2);
		
		String intdanCevrilen = ""+sayi1; //bu yöntem metod kullanmadan integer ı stringe çevirir. yoksa sayi1 tırnak içinde olmadan hata verirdi
		System.out.println(intdanCevrilen);
		
	}

}
