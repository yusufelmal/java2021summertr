package day16_;

import java.util.Scanner;

public class UrunListeFiyatıKKartiSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	     * musteri karti olup olmadigini sorun
	     *
	     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
	     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	     * alirsa %10 indirim yapin
	     */
		
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Kac adet urun aldiniz?");
         
        int urunAdedi=scan.nextInt();
         
        System.out.println("Urunun liste fiyati nedir?");
         
        double listeFiyati=scan.nextDouble();
         
        System.out.println("Musteri kartiniz var mi? Varsa evet icin ‘E’ yoksa, hayir icin ‘H’ yaziniz");
         
        char musteriKarti=scan.next().charAt(0);
         
        // double toplamFiyat= urunAdedi*listeFiyati;

        
        if (musteriKarti=='E' && urunAdedi>0 && listeFiyati>0) {
             
            if (urunAdedi>10) { 
                System.out.println("Mutseri kartiniz var ve 10 urunden fazla aldiniz, %20 indirim kazandiniz : " +urunAdedi*listeFiyati*0.8);
               
           } else {
               
                System.out.println("Mutseri kartiniz var ve 10 urunden az aldiniz, %15 indirim kazandiniz : " +urunAdedi*listeFiyati*0.85);
               
           }
             
             
               
       } else if (musteriKarti=='H' && urunAdedi>0) {
           
           if (urunAdedi>10) { 
                System.out.println("Mutseri kartiniz yok ve 10 urunden fazla aldiniz, %15 indirim kazandiniz : " +urunAdedi*listeFiyati*0.85);
               
           } else {
               
                System.out.println("Mutseri kartiniz yok ve 10 urunden yok aldiniz, %10 indirim kazandiniz : " +urunAdedi*listeFiyati*0.9);
               
           }   
           
       } else {
           
           System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");
           
       }
}
}

	
