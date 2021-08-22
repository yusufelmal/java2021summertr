package day10_stringManipulations;

public class C2_StringManipulation02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java guzeldir";

		System.out.println(str.length());

		System.out.println(' ' + 10); //42
		
		String str2 ="";
		
		System.out.println(str2.length());
		
		str2=null;
		
		//System.out.println(str2.length());
		
		String str3= "şmsfnlbdlkcejsvncvsnbvşaejvslrhvksdrjhbvşlknvalksdnvzşjrdbvkşdjrbvksjnrvçzjklrsng";
		
		//son harfin indexini almak için lenght kullanıyoruz
		
		System.out.println(str3.length()-1);
		
		
		
	}

}
