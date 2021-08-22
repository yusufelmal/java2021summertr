package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class C04_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//verilen bir array'de tekrar eden elementleri silip tekrarsiz yeni bir array haline getirin.
		
		int arr[]= {2,3,5,7,3,5,2,6,3,1,4,2,3};
		
		List<Integer> sayilar = new ArrayList<>();
		
	for (int i = 0; i < arr.length; i++) {
		if(!sayilar.contains(arr[i])) {
			sayilar.add(arr[i]);
			
			
		} 
	}
		System.out.println(sayilar);
		Collections.sort(sayilar);
		System.out.println(sayilar);
		
		int yeniArr[]=new int[sayilar.size()];
		
		for (int i = 0; i < yeniArr.length; i++) {
			
			yeniArr[i]=sayilar.get(i);
			
			
					
			
		}
		System.out.println("Tekrarsiz array : " + Arrays.toString(yeniArr));
		
		
	}

}
