package day09_switchCase;

import java.util.Scanner;

public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */  
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("vize notunuz? : ");
		
		double vize= scan.nextDouble();
		
		System.out.println("final notunuz");
		
		double finall= scan.nextDouble();
		
		System.out.println("istedginiz vize orani: ");
		
		double oranVize = scan.nextDouble();
		
		System.out.println("istediginiz final orani: ");
		
		double oranFinal = scan.nextDouble();
		
		
		double vizenet = vize*oranVize;
		
		double finalnet = finall*oranFinal;
		
		double ortalama = (vizenet + finalnet)/100;
		
		System.out.println(ortalama);
		
		if (ortalama>50) {
			System.out.println("basari ile gectiniz" + ortalama);
		} else {
			System.out.println("malesef caktiniz");
		}
		
		
		
	}

}
