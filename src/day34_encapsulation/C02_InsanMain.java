package day34_encapsulation;

public class C02_InsanMain {
	public static void main(String[] args) {
		


	C01_AdemOglu insan1=new C01_AdemOglu();
	
	insan1.name="Ahmet";
	insan1.surName="Can";
	//insan1.age=20; (private yaptıktan sonra hata veriyor)
	insan1.yasAta(-47);
	insan1.yasAta(32);
	
	System.out.println(insan1.name);
	System.out.println(insan1.surName);
	System.out.println(insan1.yasGoster());
	 
	}

}
