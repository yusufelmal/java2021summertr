package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> isimler = new ArrayList<>();

		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");

		isimler.set(1, "Fatma");
		System.out.println(isimler);

		System.out.println(isimler.set(2, "Mehmet")); // Zeki
														// delil olarak eski elementi getirir
		System.out.println(isimler);

	}

}
