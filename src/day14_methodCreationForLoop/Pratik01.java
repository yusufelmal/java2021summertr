package day14_methodCreationForLoop;

import java.util.Scanner;

public class Pratik01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        // 1. 0()dahil ile 50 arasi - D   
        // 2. 50(dahil) ile 60 arası - C   
        // 3. 60(dahil) ile 80 arası - B  
        // 4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.
        
        // switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
        // switch() de int, byte, short, char, String kullanilir.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("notunuzu giriniz : ");
		
		int not = scan.nextInt();
		
		if (not>=0 && not<50 ) {
			not=50;
		
	}else if(not>=50&&not<60){
		not = 60;

	}else if(not>=60&&not<80) {
	
		not = 80;
	}else if(not>=80&&not<100) {
	
		not = 100;
	}else {
	
		System.out.println("gecerli not giriniz.");
	}
		switch (not) {
		case 50: {
			System.out.println("notunuz : D");
			break;
		} case 60: {
			System.out.println("notunuz : C");
			break;
		} case 80: {
			System.out.println("notunuz : B");
			break;
		} case 100: {
			System.out.println("notunuz : A");
			break;
		} default:
			
			break;
		}


}

}
