package day15_forLoop;

public class Pratik01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
	    // ad ayrı soyad ayrı sekilde ekrana yazdırınız.
		

		Scanner scanner=new Scanner(System.in);
		System.out.println("adınızı soyadınız giriniz : ");
		String adSoyad=scanner.nextLine();//mustafa can
		String ad=adSoyad.substring(0,adSoyad.indexOf(" "));
		String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1);
		        System.out.println("adınız : "+ad+" soyadınız : "+soyad);
		    }
		}

	}

}
