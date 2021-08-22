package day09_switchCase;

import java.util.Scanner;

public class Odev_HaftaninSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A şehrinden uçamak isteyen bir kişi B şehrine 500km C şehrine 700km D şehrine
		 * 900 km mesafededir. km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat
		 * %50 indirim 12 ve 24 yas arasindaysa 10% indirim 65 yasindan buyukse 30%
		 * indirim gidis donus bilet alirsa yaş indirimlerinden hariç 20% indirim bu
		 * kosullara gore yolcudan gideceği mesafeyi isteyip ucak bilet ucretini
		 * hesaplayan program yazınız
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Gitmek istediginiz mesafeyi giriniz (500, 700, 900)");
		
		int mesafe =scan.nextInt();		
		
		System.out.println("yasinizi giriniz");
		
		int yas = scan.nextInt();
		
		System.out.println("tek yön mü gidis gelis mi olsun bilet ablacım ? \nT = Tek Yon, \nG = Gidis Gelis");
		
		char yon = scan.next().charAt(0);
		
		double km = 0.1;

		if (yon == 'T') {
			
			if (yas<0) {
				System.out.println("lutfen gecerli bir yas giriniz");
			} else if(yas<12){
				System.out.println("odemeniz gereken tutar : "+mesafe*km/2+"Euro");
			}  else if(yas<24){
				System.out.println("odemeniz gereken tutar : "+mesafe*km/10*9+"Euro");
			}  else if(yas>65){
				System.out.println("odemeniz gereken tutar : "+mesafe*km/10*7+"Euro");
			}  else {
				System.out.println("odemeniz gereken tutar : "+mesafe*km+"Euro");
			}
			
		if (yon == 'G') {
				
				if (yas<0) {
					System.out.println("lutfen gecerli bir yas giriniz");
				} else if(yas<12){
					System.out.println("odemeniz gereken tutar : "+mesafe*km/2*2+"Euro");
				}  else if(yas<24){
					System.out.println("odemeniz gereken tutar : "+mesafe*km/10*9*2+"Euro");
				}  else if(yas>65){
					System.out.println("odemeniz gereken tutar : "+mesafe*km/10*7*2+"Euro");
				}  else {
					System.out.println("odemeniz gereken tutar : "+mesafe*km*2+"Euro");
				}
			
			
		}
		}
	}
}


