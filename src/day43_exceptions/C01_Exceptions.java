package day43_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Exceptions {

	public static void main(String[] args) throws IOException {
		// method signiture---methodun syntax i içerisine throw değil, throws yazılır
		// throws assign etmez, handle söz konusu değildir.
		// throws kullanılan blokta exceptions oluşursa kod bloke olur

		FileInputStream fis = new FileInputStream(
				"/Users/yusuf/eclipse-workspace/java2021summertr/src/day41_exceptions/çeşitli notlar");
		int i = 0;

		while ((i = fis.read()) != -1) { // i int değeri fis obj read metodu ile atandiğinda -1 eşit değilse
											// while body e gir
			System.out.print((char) (i));
		}
	}

}
