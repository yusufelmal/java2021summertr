package day08_praktischunterricht;

public class PraktischZwei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // Write a Java program to break an integer into a sequence of individual digits.
		// Hint: use / and %
		// ex: input: 12345
//		    output: 1
//		            2
//		            3
//		            4
//		            5

		int x = 12345;
		int birler = x%10; //5
		int onlar = x/10%10; //4
		int yüzler = x/100%10; //3
		int binler = x/1000%10;
		int onbinler = x/10000%10;
		
		System.out.println(birler + "\n"+ onlar + "\n"+ yüzler + "\n" + binler + "\n" + onbinler);
		
	}

}
