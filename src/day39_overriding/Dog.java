package day39_overriding;

public class Dog extends Animal {

	@Override

	// bu javanın bir Annotationu-->mutlaka child a yazılır
	// parent ve child arasında ilişki kurar,
	// bunu yazmazsan ilişki oluşmaz.
	public void beslenme() {
		System.out.println("kemik ile beslenir");

	}

	@Override
	public void tatli() {
		System.out.println("fistik sarma");
	}

	@Override
	public String icecek() {
		System.out.println("ne icsem acaba");
		return "yarasin";

	}

	@Override
	public Integer topla() {
		return 41+54;
	}

	@Override
	public Dog fatih() {
		// TODO Auto-generated method stub
		return new Dog();
	}
	
	

}
