package day44_abstractClasses;

public abstract class Banka {
	
//	1) Abstract Banka class ceat ediniz. fields: double Bakiye;
//	p'li constructor creat ediniz
//	p'siz constructor --> print:Hesap hareketleri...
//	p'li paraYatir ve p'li paraCek abs method creat ediniz
//	2)Banka class'in sup class'i BenimHesabim class creat ediniz
//	p'li bakiye print eden constructor creat ediniz
//	3) HesapHareketlerim claaas,nda obj ile islemler yapip yazdiriniz

	double bakiye;
	
	public Banka(double bakiye) {
		this.bakiye=bakiye;
	}

	public Banka() {
		System.out.println("hesap harekeri");
	}
	
	abstract double paraYatir(double miktar);
	abstract double paraCek(double miktar);
	
}
