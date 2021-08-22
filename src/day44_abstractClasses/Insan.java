package day44_abstractClasses;

public abstract class Insan {
	
	private String isim;
	private String soyisim;
	public Insan(String isim, String soyisim) {

		this.isim = isim;
		this.soyisim = soyisim;
		
		
	}
	
	public abstract void calisanMi ();
	
	public void bilgilendirme() {
		System.out.println(this.isim);
		System.out.println(this.soyisim);
	}
	
	public void isimDegistir(String isim, String soyisim) {
		this.isim =isim;
		this.soyisim=soyisim;
	}
	

}
