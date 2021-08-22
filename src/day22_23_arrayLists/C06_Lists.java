package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 100den buyuk ilk 20 fibonacci sayisini list olarak yazdirin

		List<Integer> fibo = new ArrayList<>();
		List<Integer> istenenSayilar = new ArrayList<>();

		fibo.add(0);
		fibo.add(1);

		int count = 0;
		int sayi = 0;
		int i = 1;

		do {
			sayi = fibo.get(i - 1) + fibo.get(i);
			fibo.add(sayi);
			i++;
			if (sayi > 100) {
				istenenSayilar.add(sayi);
				count++;
			}
			

		} while (count <= 20);

		System.out.println(istenenSayilar);
		System.out.println(fibo);
	}

}
