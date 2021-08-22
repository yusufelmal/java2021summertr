package day14_methodCreationForLoop;

import java.util.Scanner;

public class Pratik08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//kullanıcıdan alacağınız bir stringte boşluk karakterlerinin olup olmadığını kontrol ediniz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir kelime giriniz: ");
		
		String name=scan.nextLine();
		
		System.out.println("girdiginiz kelimede " + name.contains(" "));
	}

}
