package day38;

public class Mammal extends Animal{
	
	public void mA() {
		System.out.println("animal"+"osman");
	}
	
	public void mC() {
		System.out.println("animal" + "necati");
	}

	public int c=7;
	public int m=4; 
	
	public Mammal() {
		this('A');
		System.out.println("parametresiz mammal constructoru");
		
	}
	public Mammal (char c) {
		super(34);//parentten parametreli constructor çağırdım
		System.out.println("char parametreli constructor");
	}
}
