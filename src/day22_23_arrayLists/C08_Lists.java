package day22_23_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C08_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"3","5","7"};
		
		List<String> arrList=Arrays.asList(arr);
		
		System.out.println(arrList);
		
		arr[1]="Ali";
		
		System.out.println("list olarak 2 " + arrList);
		
		arrList.set(0, "ayse");
		
		System.out.println("list : " +arrList);
		
		System.out.println("array : " +Arrays.toString(arr));
	}

}
