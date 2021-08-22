package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exceptions {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream(
					"/Users/yusuf/eclipse-workspace/java2021summertr/src/day41_exceptions/çeşitli notlar");
			int i = 0;

			try {

				while ((i = fis.read()) != -1) { // i int değeri fis obj read metodu ile atandiğinda -1 eşit değilse
													// while body e gir
					System.out.print((char) (i));
				}

			} catch (IOException e) { // io input output kısaltması
				// TODO: handle exception
				e.printStackTrace(); // bu daha çok kullanilir çünkü khatanın tüm verisini verir. handle kolaylığı
										// sağlar

				System.out.println(e.getMessage());
			}

		}

		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		System.out.println("buraya kadar geldiysen kod çalışmış demektir");
	}
}
