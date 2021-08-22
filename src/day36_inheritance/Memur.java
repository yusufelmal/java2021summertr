package day36_inheritance;

public class Memur extends Muhasebe {

	public static void main(String[] args) {
		
		Memur m1=new Memur();
		Memur m2=new Memur();
		
		m1.isim="Ahmet";
		m1.soyIsim="cart";
		m1.adres="kadikoy";
		m1.saatUcreti=20;
		m1.statu="chef";
		m1.tel="02347623549";
		m1.id=m1.idAta();
		m1.maas=m1.maasHesapla();
		
		
		System.out.println(m1.isim + "\n" + m1.soyIsim + "\n" +m1.tel+ "\n" + m1.id);
		
				
	}
}
