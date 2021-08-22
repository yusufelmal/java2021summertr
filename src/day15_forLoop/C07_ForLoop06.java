package day15_forLoop;

import java.util.Scanner;

public class C07_ForLoop06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// kullanicidan bir string isteyin ve stringi tersten yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("tersten yazdirmak için bir stirng veriniz");
		
		String kelime=scan.nextLine();
		
		for (int i = 0; i < kelime.lenght(); i++) {
			System.out.println(kelime.substring(kelime.length()-1-i, kelime.length()-i));
			
		}
		
		
	}

}


package day15_forLoops;
import java.util.Iterator;
import java.util.Scanner;
public class C07_ForLoops06 {
    public static void main(String[] args) {
        /*
         Soru 7 ) Interview Question 
         Kullanicidan bir String isteyin ve Stringi tersten yazdirin. 
         */
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen tersten yazdirmak icin bir String yaziniz ");
        
        String kelime=scan.nextLine();
        for (int i = 0; i < kelime.length(); i++) {
            System.out.print(kelime.substring(kelime.length()-1-i, kelime.length()-i));
        }
        
        System.out.println("");
        for (int i = kelime.length()-1; i >= 0; i--) {
            System.out.print(kelime.substring(i,i+1));
        }
        
    }
}
Ausblenden





Nachrichten senden an java-code-sharing










