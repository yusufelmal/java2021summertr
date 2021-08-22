package day35_encapsulationSorular;

import java.util.Scanner;

public class C04_BookMain {

	public int a = 5;

	public static void main(String[] args) {

		C03_Book kitap = new C03_Book();

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen okudugunuz kitabı giriniz");
		String kitap2=scan.nextLine();
		
		kitap.setBookName("maceralı pamuk");
		kitap.setAuthorName(kitap2);
		
		System.out.println("birinci kitabım : " + kitap.getBookName() + " ikinci kitabım: "+ kitap.getAuthorName());

	} 

}
