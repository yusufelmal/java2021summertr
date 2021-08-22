package day43_exceptions;

public class Final {
	
	static final int AGE=33;
	
	//büyük harf variable, demek ki bu final.
	
	public static void main(String[] args) {
		
		//AGE=34;
		//The final field Final.AGE cannot be assigned
		//uyarı sil final'i şeklinde. sildim. yukarda int ile AGE arasındaki
		//final i sildi. hata ortadan kalktı.
		
		//final keyword ile veri immutable hale gelir. oynayamazsın
		//kaldırdık ve aşağıda assign edebildik.
		
		int zam=3000;
		
		//asagidaki durumda hata var. remove final yapınca düzeliyor.
		
		//final int maas=5000;
		//maas+=zam;
		
		
		
	}

}
