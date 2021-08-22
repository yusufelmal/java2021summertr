package day31_varargs;

public class C02_Varargs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       // Varargs kullanarak verilen Stringleri birlestiren concat isimli bir method
        // olusturunuz
        concat("m", "e", "r", "v", "e");
        concat("a", "l", "i");
    }
    private static void concat(String... string) {
        String s = "";
        for (String w : string) {
            s = s.concat(w);
        }
        System.out.println(s);

	}

}
