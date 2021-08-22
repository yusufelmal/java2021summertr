package day09_switchCase;

import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Tanımı Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin
		 * kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız (ipucu: Bir
		 * üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor bağlantısından
		 * yararlanabilirsiniz) Örnek Ekran Çıktısı birinci kenarı giriniz: 2 ikinci
		 * kenarı giriniz 15 üçüncü kenarı giriniz: 7 Bu bir dik üçgen değildir. Bu bir
		 * dik üçgendir
		 */
		
		
		
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("ilk kenar : ");	
	int a =scan.nextInt();
	
	System.out.println("diğer kenar: ");
	int b =scan.nextInt();
	
	System.out.println("son kenar: ");
	int c =scan.nextInt();
	
	if (a<=0 || b<=0 ||c<=0) {
		System.out.println("hatali giris yaptiniz");
	
		
	
	if ((a*a)+(b*b)==(c*c)) {
		System.out.println("bu bir dik ücgendir");
	}else if ((a*a)+(c*c)==(b*b)) {
		System.out.println("bu bir dik ücgendir");
	}else if ((c*c)+(b*b)==(a*a)) {
		System.out.println("bu bir dik ücgendir");
	
	}else{
		System.out.println("bu bir dik ücgen degildir");
	}

	}
	
	}
	

}
