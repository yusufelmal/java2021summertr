package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis=new FileInputStream("/Users/yusuf/eclipse-workspace/java2021summertr/src/day41_exceptions/çeşitli notlar");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("catche girmediyse dosyayi bulmustur");
	}

}
