package day11_stringManipulations;

import java.util.Scanner;

public class Hausaufgabe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//ikinci klasördeki mail adresini @ahmet@mehmet@gmail.com gibi yazdırmama müsade etmesin
		

        Scanner scan=new Scanner(System.in);
        System.out.println("mail adresinizi girin: ");
        String mail=scan.next();
        int son = mail.indexOf("@gmail.com", mail.length()-10); 
        
        if (mail.contains("@gmail.com") && son !=-1) {
            System.out.println("mailiniz kaydedildi");
        } else {
            System.out.println("geçerli gmail adresi girin: ");
        }
scan.close();
    }
}
		
//MELİHA HANIM SORULDU CEVAP BEKLENİYOR --9.7.2021--