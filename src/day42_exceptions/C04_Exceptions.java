package day42_exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Exceptions {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };

		System.out.println(arr[1]);
		System.out.println(arr[3]);
		// System.out.println(arr[5]);
		// //java.lang.ArrayIndexOutOfBoundsException:--unchecked(yani run edince
		// gördüğümüz bir hata)

		List<String> gzlinsn = new ArrayList<>(Arrays.asList("ahmet", "mehmet", "nuri"));

		System.out.println(gzlinsn.get(2));
		System.out.println(gzlinsn.get(0));
		System.out.println(gzlinsn.get(5));//java.lang.IndexOutOfBoundsException:-unchecked
		
		

	}

}
