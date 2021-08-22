package day44_abstractClasses;

public abstract class Volvo {

	abstract void kapi();

	abstract void motor();

	public static void main(String[] args) {

		Volvo yeni = new Volvo() {

			@Override
			void kapi() {
				// TODO Auto-generated method stub

			}

			@Override
			void motor() {
				// TODO Auto-generated method stub

			}

			public void sunroof() { // abstract olm, yani concrete method
				System.out.println("sunroof ile hayat güzel");

			}

		};
	}
}
