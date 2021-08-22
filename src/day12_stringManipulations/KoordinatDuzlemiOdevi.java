package day12_stringManipulations;

import java.util.Scanner;

public class KoordinatDuzlemiOdevi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        //// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
		
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lütfen koordinat düzlemin için x ve y yi temsil etmek üzere iki sayı giriniz : ");
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if (x>0 && y>0) {
			System.out.println("noktaniz 1. bölgededir.");
		} else if(x>0 && y<0) {
			System.out.println("noktaniz 2. bölgededir");
		} else if(x<0 && y>0) {
			System.out.println("noktaniz 4. bölgededir");
		} else if(x<0 && y<0) {
			System.out.println("noktaniz 3. bölgededir");
		}else if(x==0 && y!=0) {
			System.out.println("nokta x ekseni üzerindedir");
		}else if(x!=0 && y==0) {
			System.out.println("nokta y ekseni üzerindedir");
		}else {
			System.out.println("nokta orjindir");
		}
		
		

		 /*       Scanner scan = new Scanner(System.in);
		        System.out.println("Lütfen  X ve Y   değerlerini giriniz");
		        int x = scan.nextInt();
		        int y = scan.nextInt();

		        if (x > 0 && y > 0) {
		            System.out.println("Girdiğiniz nokta 1. bölgede");
		        } else if (x < 0 && y > 0) {
		            System.out.println("Girdiğiniz nokta 2. bölgede");
		        } else if (x < 0 && y < 0) {
		            System.out.println("Girdiğiniz nokta 3. bölgede");
		        } else if (x > 0 && y < 0) {
		            System.out.println("Girdiğiniz nokta 4. bölgede");
		        } else if (x == 0 && y!=0) {
		            System.out.println("Girdiğiniz nokta Y ekseni üzerindedir");
		        } else if (y == 0 && x!=0) {
		            System.out.println("Girdiğiniz nokta X ekseni üzerindedir");
		        }else {
		            System.out.println("Orijin noktasını girdiniz");
		        }
		    }
		}*/
	}

}
