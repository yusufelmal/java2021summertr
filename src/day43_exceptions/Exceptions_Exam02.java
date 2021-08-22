package day43_exceptions;

public class Exceptions_Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bura exam01 in diğer versiyonu
		
		
	try {
		ortalama(120,80);
	} catch (Exception e) {
System.out.println(e);	

	}
			
			

		}

		public static void ortalama(int v, int f) {

			if (v > 100 || v < 0 || f > 100 || f < 0) {
				throw new ArithmeticException("Notlar 0-100 arasında olmalı");

			} else {
				System.out.println("ortalama : " + (((v * 4) / 10) + ((f * 6) / 10)));
			}

	}

}
