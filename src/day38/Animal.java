package day38;

public class Animal {

// aynı isimli variable lar obje ile call edilirken önce objenin kendi klasından variable call edilir. sonra parentindeki varilable call edilir. 

	public void mA() {
		System.out.println("animal");
	}
	public void mM() {
		System.out.println("animal"+" mammal");
	}

	public int a=5;
	public int m;
	
	public Animal() {
		System.out.println("parametresiz constructor");
		
	}
	
	public Animal(int i) {
		System.out.println("parametreli constructor");
		
	}
}
 