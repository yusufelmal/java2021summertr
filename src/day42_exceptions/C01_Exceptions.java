package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Exceptions {

	// burada yapılan şey try lardan birini çıkardık. geriye iki catch kaldı.
	// catchler sırayla çalışır
	// pratik olsun diye try dan sonra farklı ihtimalleri catch yapabilirsiniz.
	// parent child ilişkisi yukardan aşağı önce child sonra parent yazılmalı
	// parent child ilişkisi şöyle>> exception>ioexception>filenotfoundexception bu
	// yüzden childden başlar
	// dolayısıyla ilk catch filenot, bulacak ki okuyacak, okuma 2. sıra
	// ioexception, 3. sıra exception olacak
	// bazı catch body leri arasında parent child ilişkisi olmaz. bu türden durumda
	// hepsi çalışır hata gelmez


	public static void main(String[] args) {
		try {

			FileInputStream fis = new FileInputStream(
					"/Users/yusuf/eclipse-workspace/java2021summertr/src/day41_exceptions/çeşitli notlar");
			fis.close();
			int i = 0;

			while ((i = fis.read()) != -1) { // i int değeri fis obj read metodu ile atandiğinda -1 eşit değilse
												// while body e gir
				System.out.print((char) (i));
			}
		}

		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());

		} catch (IOException e) { // io input output kısaltması
			// TODO: handle exception
			e.printStackTrace(); // bu daha çok kullanilir çünkü khatanın tüm verisini verir. handle kolaylığı
									// sağlar

			System.out.println(e.getMessage());

		}

		System.out.println("buraya kadar geldiysen kod çalışmış demektir");
	}
}
