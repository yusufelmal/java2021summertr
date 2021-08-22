package day10_stringManipulations;

import java.util.Scanner;

public class C3_StringManipulation03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java ogrenmek guzeldir";
				
				System.out.println(str.indexOf("e"));
				
				System.out.println(str.indexOf(' '));
				System.out.println(str.indexOf("mek"));
				System.out.println(str.indexOf(""));
				System.out.println(str.indexOf("j"));
				System.out.println(str.indexOf("J"));
				System.out.println(str.indexOf("m", 12));//10.karakterden sonraki ilk m
				
				Scanner scan= new Scanner(System.in);
				System.out.println("bir içerik girin: ");
				
				String icerik =scan.nextLine().toLowerCase();
				
				if (icerik.indexOf("java") == -1) {
					System.out.println("daha cok calisman lazim");
				} else {
					System.out.println("aferim");
				}
				
				// diğer yol
				
				System.out.println(icerik.indexOf("java")==-1 ? "daha cok calisman lazim" : "aferin");
	
	}
}
