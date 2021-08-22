package day16_;

import java.util.Scanner;

public class PratikScanner7TR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Kullanıcı tarafından girilen DOUBLE sayıyı tam 
		 * sayıya çeviren bir program yazınız.
		 */
Scanner scan =new Scanner(System.in);

System.out.println("bir double \nsayi giriniz : ");

double sayi = scan.nextDouble();

int sayi1= (int)sayi;

System.out.println(sayi1);
scan.close();

	}

}
