package day12_stringManipulations;

public class C01_StringManipulation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java candir";
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(10));
		System.out.println(str.substring(11));
		//System.out.println(str.substring(20));// hata
		
		System.out.println(str.substring(5,8));
		System.out.println(str.substring(5,11));
		System.out.println(str.substring(5,5));//hiç
		//System.out.println(str.substring(5,1));
		
	}

}
