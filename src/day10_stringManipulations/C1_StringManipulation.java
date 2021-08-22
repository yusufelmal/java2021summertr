package day10_stringManipulations;

public class C1_StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "Ali Can";
		String name2 = "Ali Can";
		String name3 = name2 + "";
		String name4 = "Ali";
		String name5 = "Can";
		String name6 = name4 + " " + name5;

		System.out.println(name1.equals(name2)); // True
		System.out.println(name1.equals(name3)); // True
		System.out.println(name2.equals(name6)); // True

		System.out.println(name1 == name2); // True
		System.out.println(name1 == name3); // False
		System.out.println(name2 == name6); // False
		
		//degerleri karsilastirmak ve supriz yasamamak istiyorsan equals kullan. bi nevi denktir gibi. eşittir olan eşittir gibi.
		
		String name7 = "ALI CAN";
		String name8= "AlI cAn";
		String name9 = "ali can";
		String name10 = "AliCan";
		
		System.out.println(name1.equals(name7));//false
		System.out.println(name1.equalsIgnoreCase(name7));//true
		
		System.out.println(name7.equalsIgnoreCase(name9));
		System.out.println(name8.equalsIgnoreCase(name9));
		System.out.println(name9.equalsIgnoreCase(name10));
	

	}

}
