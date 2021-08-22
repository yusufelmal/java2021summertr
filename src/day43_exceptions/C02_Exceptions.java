package day43_exceptions;

public class C02_Exceptions {

	public static void main(String[] args) {

		int[] arr = { 34, 35, 42, 21, 43 };

		try {
			System.out.println(arr[30]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e.getMessage());
			System.out.println("hatali girdiniz.");

//		} finally {
//			System.out.println("agam onundeki maclara bak");
			
			//try bloğu final varken catch siz çalışır
			// try, throws exception, sonra da finally şeklinde çalışır
		}

	}
}
