package day01variables;

public class deneme {

	interface IHayvan {
	    String isimAl();
	    String konus();
	 }

	 abstract class TemelHayvanSinifi implements IHayvan {
	    private final String isim;
	    protected TemelHayvanSinifi(final String ISIM) {
	        isim = ISIM;
	    }
	    public String isimAl() {
	        return isim;
	    }
	 }

	 class Kedi extends TemelHayvanSinifi {
	    public Kedi(final String ISIM) {
	        super(ISIM);
	    }
	    public String konus() {
	        return "Miyav!";
	    }
	 }

	 class Kopek extends TemelHayvanSinifi {
	    public Kopek(final String ISIM) {
	        super(ISIM);
	    }
	    public String konus() {
	        return "Hav! Hav!";
	    }
	 }

	 public class Test {
	    public void main(final String[] ARGUMENTS) {
	        final IHayvan[] hayvanlar = {
	            new Kedi("Mirnav"),
	            new Kedi("Kara kedi"),
	            new Kopek("Karabas")
	        };
	        for (final IHayvan hayvan : hayvanlar) {
	            System.out.println(hayvan.isimAl() + ": " + hayvan.konus());
	        }
	    }
	 }
}
