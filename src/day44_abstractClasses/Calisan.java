package day44_abstractClasses;

public class Calisan extends Insan {
	
	private int calisanId;

	public Calisan(String isim, String soyisim, int calisanId) {
		super(isim, soyisim);
		this.calisanId=calisanId;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calisanMi() {
		// TODO Auto-generated method stub
		
		if (this.calisanId==0) {
			System.out.println("bu sahis sirket calisani degil");
			System.out.println("sahsin idsi" +calisanId);
		} else {
			System.out.println("bu sahis sirket calisanidir");
			System.out.println("sahsin idsi" +calisanId);

		}
		
		
		
	}
	
	public static void main(String[] args) {
		Calisan sekreter=new Calisan("Ahmet", "Mehmet", 0);
		Calisan qaTester=new Calisan("Osman", "Nuri", 444);
		Calisan dev=new Calisan("Ayse", "Farma", 345);
		
		
		sekreter.bilgilendirme();
		sekreter.calisanMi();
		
		qaTester.bilgilendirme();
		qaTester.calisanMi();
		
		dev.bilgilendirme();
		dev.calisanMi();
	}

}
 