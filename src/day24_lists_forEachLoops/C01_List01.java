package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*
        Kullanicidan isimler isteyin ve bunlari bir list’te depolayin. 
        Kullanici "yeter" yazana kadar isim istemeye devam edin.
        
        Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini 
        ve bunlardan kac tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
   
       isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal
       
       Not : yeter icin kucuk buyuk harf onemli degil ancak isimler icin onemli
        */
Scanner scan=new Scanner(System.in);
List<String> girilenIsimler=new ArrayList<>();
String isim;

		
		do {
			System.out.println("lutfen listeye eklemek icin isim giriniz \nBitirmek icin yeter yaziniz : " );
			
			
			isim=scan.nextLine();
			
			if (!isim.equalsIgnoreCase("yeter")) {
			
			girilenIsimler.add(isim);
			
			}
			
		} while(!isim.equalsIgnoreCase ("yeter"));
		
		String isimler[]= {"Ali", "Veli", "Ayse", "Fatma"};
		List<String> isimList=Arrays.asList(isimler);
		
		System.out.println("Toplam : " + girilenIsimler.size()+ " isim girdiniz");
		
		int count = 0;
		
		for (int i = 0; i < girilenIsimler.size(); i++) {
			if (isimList.contains(girilenIsimler.get(i))) {
				count++;
			}
			
			
		}
		
		System.out.println(girilenIsimler);
		System.out.println("girdiginiz isimlerden " + count + " tanesi bendeki listede kayitli");
		
		scan.close();
	} 

}
