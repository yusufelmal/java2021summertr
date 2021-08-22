package day09_switchCase;

import java.util.Locale;

public class C4_StringManipulation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String isim = "Yusuf";
		String soyisim = "Elmal";

		System.out.println(isim + " " + soyisim);

		System.out.println(isim.concat(" ").concat(soyisim));
		
		System.out.println(isim.charAt(2));
		System.out.println(isim.charAt(4));
		
		//int sayi=isim;
		
		String str="Masa";
		System.out.println(str.toLowerCase(Locale.forLanguageTag("de")));
	}

}
