package day34_encapsulation;

public class C04_ArabaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C05_Araba volvo=new C05_Araba("xc90", "siyah", -2000, -1990);
		
		C05_Araba audi=new C05_Araba("a4", "beyaz", 1600, 2020);
		
		C05_Araba honda=new C05_Araba();
		
		honda.model="accord";
		honda.renk="beyaz";
		honda.setYil(2015);
		honda.setMotor(2000);
		
		System.out.println(honda.getYil());
		System.out.println(honda.getMotor());
		System.out.println(volvo.getMotor());
		System.out.println(volvo.getYil());
	}

}
 