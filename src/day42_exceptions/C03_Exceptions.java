package day42_exceptions;

public class C03_Exceptions {

	public static void main(String[] args) {
		String str1=" ";//space
		String str2="";//hiçlik
		String str3=null;//str3 variable ının hiçbir değere eşit olmadığını gösteren belirteç
		
		System.out.println(str1.length());//1
		System.out.println(str2.length());//0
	//	System.out.println(str3.length());//java.lang.NullPointerException
		//checked exceptionu : yazarken hata verir
		//unchecked exceptionu: run edince ortaya çıkar
		
		System.out.println(str3+" erol tas"); //null erol tas --calisti
	//	System.out.println(str3.concat("erol tas"));// ama burayı hata verdi yine. cünkü null
		
		System.out.println(str3);// yazdırır ama . koyarak işlem yapamazsın. 

		
		
		
	}
}
