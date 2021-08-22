package day44_abstractClasses;

public class BenimHesabim extends Banka{

	@Override
	double paraYatir(double miktar) {
		// TODO Auto-generated method stub
		super.bakiye+=miktar;
		return bakiye;
	}

	@Override
	double paraCek(double miktar) {
		// TODO Auto-generated method stub
		super.bakiye-=miktar;
		return miktar;
	}
	
	public BenimHesabim(double bakiye) {
		super.bakiye=bakiye;
		System.out.println(bakiye);
	}
	

}
