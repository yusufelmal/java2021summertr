package day38;

public class Cat extends Mammal{
	
	public void mD() {
		System.out.println("nankör kedi");
	}
	
	public void mA() {
		System.out.println("metodu her türlü en alttan mı cagiriyor test");
	}
	
	public void mC() {
		System.out.println("cat");
	}
	
	public int c=9;//parenti ile aynı
	public int d=5; 
	 
	Cat () {
		System.out.println("parametresiz constructor cat ");
	}
	Cat (String s) {
		this();
		System.out.println(super.c);
		System.out.println("parametreli constructor cat");
	}
	 

}
