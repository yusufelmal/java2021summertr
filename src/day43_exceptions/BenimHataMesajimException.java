package day43_exceptions;

public class BenimHataMesajimException extends Exception{

// checked exception oluşturacaksak exception klasına extend edilir. yukarıdaki satır bu işlem. 

	private static final long serialVersionUID = 1L;
	
	public BenimHataMesajimException(String message) {
		super(message); //pli constructor ürettim ki bu classtan oluşan obje ile classtan ve parentinden field ve variable call edebileyim
		
	}

}
