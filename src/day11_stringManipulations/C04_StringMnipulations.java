package day11_stringManipulations;

public class C04_StringMnipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kkNo = "1234 1234 1354 5345 @# deneme";
		
		System.out.println(kkNo.replace(" ", ""));
		
		System.out.println(kkNo); 
		
		System.out.println(kkNo.replaceAll("\\s", "*"));//kucuk s sadece space olanları degistirir
		System.out.println(kkNo.replaceAll("\\S", "*"));// buyuk s sadece karakterleri, space olmayan her şeyi değiştirir.
		System.out.println(kkNo.replaceAll("\\w", "-"));//harf veya rakamlraın dışındakilerin hepsi
		System.out.println(kkNo.replaceAll("\\W", "-"));// harf ve rakamların hepsi
		System.out.println(kkNo.replaceAll("\\d", "-"));// rakamların -digit- hepsi
		System.out.println(kkNo.replaceAll("\\D", "-"));// rakamların dışındakilerin hepsi
		
		//bu konunun adı regular expressions
		
				
				
	}

}
