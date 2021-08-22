package day09_switchCase;

import java.util.Scanner;

public class Odev_HaftaninSorusu03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        /*
		         * A şehrinden uçamak isteyen bir kişi B şehrine 500km C şehrine 700km D şehrine
		         * 900 km mesafededir. km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat
		         * %50 indirim 12 ve 24 yas arasindaysa 10% indirim 65 yasindan buyukse 30%
		         * indirim gidis donus bilet alirsa yaş indirimlerinden hariç 20% indirim bu
		         * kosullara gore yolcudan gideceği mesafeyi isteyip ucak bilet ucretini
		         * hesaplayan program yazınız
		         */
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Lutfen gideceginiz yeri belirtiniz (B,C,D=?) = ");
		        char varisYeri = scan.next().charAt(0);
		        System.out.println("Lutfen Yasinizi Giriniz.");
		        int yas = scan.nextInt();
		        System.out.println("Gidis Donus Mu (E/H)");
		        char gidisDonus = scan.next().toUpperCase().charAt(0);
		        if (varisYeri == 'B') {
		            if (yas < 12) {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + ((500 * 0.10 * 0.5) - (500 * 0.10 * 0.5 * 0.2)));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 500 * 0.10 * 0.5);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            } else if (yas >= 12 && yas < 24) {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + ((500 * 0.10 * 0.10) - (500 * 0.10 * 0.10 * 0.20)));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 500 * 0.10 * 0.10);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            } else if (yas > 65) {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + (500 * 0.10 * 0.30 - 500 * 0.10 * 0.30 * 0.20));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 500 * 0.10 * 0.30);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            } else {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + (500 * 0.10 - 500 * 0.10 * 0.20));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 500 * 0.10);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            }
		        } else if (varisYeri == 'C') {
		            if (yas < 12) {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + ((700 * 0.10 * 0.5) - (700 * 0.10 * 0.5 * 0.2)));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 700 * 0.10 * 0.5);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            } else if (yas >= 12 && yas < 24) {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + ((700 * 0.10 * 0.10) - (700 * 0.10 * 0.10 * 0.20)));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 700 * 0.10 * 0.10);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            } else if (yas > 65) {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + (700 * 0.10 * 0.30 - 700 * 0.10 * 0.30 * 0.20));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 700 * 0.10 * 0.30);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            } else {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + (700 * 0.10 - 700 * 0.10 * 0.20));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 700 * 0.10);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            }
		        } else if (varisYeri == 'D') {
		            if (yas < 12) {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + ((900 * 0.10 * 0.5) - (900 * 0.10 * 0.5 * 0.2)));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 900 * 0.10 * 0.5);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            } else if (yas >= 12 && yas < 24) {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + ((900 * 0.10 * 0.10) - (900 * 0.10 * 0.10 * 0.20)));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 900 * 0.10 * 0.10);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            } else if (yas > 65) {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + (900 * 0.10 * 0.30 - 900 * 0.10 * 0.30 * 0.20));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 900 * 0.10 * 0.30);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            } else {
		                if (gidisDonus == 'E') {
		                    System.out.println("Ucret : " + (900 * 0.10 - 900 * 0.10 * 0.20));
		                } else if (gidisDonus == 'H') {
		                    System.out.println("Ucret : " + 900 * 0.10);
		                } else {
		                    System.out.println("Yanlis Girdiniz");
		                }
		            }
		        } else {
		            System.out.println("Boyle Bir Ucusumuz Yoktur. Tekrar Deneyiniz.");
		        }
		        scan.close();
		    }
		

	

}
