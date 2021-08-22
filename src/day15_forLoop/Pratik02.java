package day15_forLoop;

public class Pratik02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.



		            
		            String b = "Haluk 1453 ?!@$_";
		            
		            
		            System.out.println("orjinal metin ---> "+b);
		            
		            System.out.println();
		            
		            // \\d ifadesi tum rakamlari(digit) temsil eder.
		        System.out.println("Tüm rakamların * hali ---> "+b.replaceAll("\\d","*"));       
		        // ===>  \\D rakamlar disindaki hersey
		                System.out.println("Tüm rakam hariclerin * hali ---> "+b.replaceAll("\\D","*"));
		        
		        System.out.println();
		        
		        
		        //==> \\S space disindaki hersey
		        System.out.println("Tüm space hariclerin * hali ---> "+b.replaceAll("\\S","*"));
		        
		        //==> \\s space ifadesidir.
		        System.out.println("Tüm space'nin * hali ---> "+b.replaceAll("\\s","*"));
		        
		        // replace ile yapma
		        System.out.println("replace ile Tüm space'nin * hali ---> "+b.replace(" ","*"));
		        
		        System.out.println();
		        
		        //==>  \\w ifadesi (word->kelime ve hadf) a-z A-Z 0-9 _  bunlari kapsar
		        System.out.println("Tüm harf ve rakamların * hali ---> "+b.replaceAll("\\w","*"));
		        
		        //==>  \\W ifadesi a-z A-Z 0-9 ve  _ disindakileri kapsar
		        
		        System.out.println("Tüm harf ve rakam  hariclerin * hali ---> "+b.replaceAll("\\W","*"));
		        
		        
		        
		        package _05_StringManipulation;
		        import java.util.Scanner;
		        public class Q03 {
		            public static void main(String[] args) {
		                //Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
		                // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
		                Scanner scanner=new Scanner(System.in);
		                System.out.println("adınızı soyadınız giriniz : ");
		                String adSoyad=scanner.nextLine();//hakan tetik javacı
		                
		               String name1=adSoyad.substring(0,adSoyad.indexOf(" "));
		               String name2=adSoyad.substring(adSoyad.indexOf(" ")+1,adSoyad.lastIndexOf(" "));
		               String soyadString=adSoyad.substring(adSoyad.lastIndexOf(" ")+1);
		                
		               char n1=name1.charAt(0);
		               char n2=name2.charAt(0);
		               char n3=soyadString.charAt(0);
		               
		           System.out.println("adınız : "+name1+ " ikinci adınz : "+name2+" soyadınız : "+soyadString); 
		           System.out.println(n1+". "+n2+". "+n3+".");
		            }
		        }
		        
		        
		                
		    }
		}
	}

}
