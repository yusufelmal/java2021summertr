package day42_exceptions;

public class C05_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi = 34;
		String str = "1453";

		// String str1=sayi;//cte, yani checked exception
		// bu aslında class test hatasıdır. stringe int atar gibi atama yapamazsın.
		// klasslar eşleşmez. data type ile variable eşleşmiyor.

		int okulNo = Integer.parseInt(str);// bununla okulNo yu integer a çevirdik.
		System.out.println(okulNo);
		System.out.println(okulNo + 35);// iki int toplamını verdi 1488
		System.out.println(str + 35);// concat yaptı iki stringi yan yana yazdı 145335

		String str1 = "14a3";

		System.out.println(str1);
		// int strSayisi=Integer.parseInt(str1);
		// System.out.println(strSayisi);//java.lang.NumberFormatException: //unchecked
		// exception--run edince oldu

		Object sayi3 = 45; // en büyük klas, tüm klasların atası
		String strSayi2 = (String) sayi3; //class ccast exception, unchecked verdi. runtime exceptions. 

	}

}
