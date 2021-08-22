package day38;

public class runner {

	public static void main(String[] args) {
		Cat c1 = new Cat(); // parametresiz constructor ile obje ürettik
		// görünmez süper var arada, bu yüzden Catin super sınıfına yani mammal'a
		// gittik ve ordan parametresiz constructor u bulduk.
		/*
		 * public Mammal() { this('A');
		 * System.out.println("parametresiz mammal constructoru"); bu paramatresiz
		 * constructor., orda alttaki this varsa super yok anlamına gelir. bu classta
		 * kal demek bu yüzden o klasstaki parametreli constructoru bul içine A yı çak
		 * demek oluyor public Mammal (char c) { super(34);//parentten parametreli
		 * constructor çağırdım System.out.println("char parametreli constructor"); o da
		 * bir altındaki yukardaki ifade. o da nereye götürüyor beni. süpere git 34 yaz
		 * diyor. süperim de animal olduğu için oraya gidiyorum
		 * 
		 * orda da şu var:
		 * 
		 * public Animal(int i) { System.out.println("parametreli constructor");
		 * 
		 * bunun içindeki ilk ifade yazıldı böylece
		 */
		System.out.println(c1.a);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println(c1.m);

		c1.mA();
		c1.mC();
		c1.mM();

		// aynı isimli methodlar call edilirken, örn mC iki yerde var,
		/*
		 * hem cat hem de mammalda. hangisine gideceğine constructor karar verir
		 * childden parente doğru hiyerarşi yapar. child önce
		 */

		// datatype ve constructor farklı classlarda ise
		// aşağıdaki işlem oluyor.
		// Parent obj=new Child(); şeklinde yazılıyor
		// bu yüzden de yuakrıdaki durumun tersine önce parentten okuyor
		// sonra child i okuyor

		Mammal c2 = new Cat("x");
		System.out.println(c2.a);
		System.out.println(c2.c);
		System.out.println(c2.m);
		// çakışmalar var hem cat hem mammaldan çağırabilecekken önce
		// mammal olmasının sebebi önce kendi klasından çağırması gerekiyor.
		// yani data type i mammal olduğu için artık mammal ve yukarısından
		/*
		 * data çekebiliyoruz. daha altından çekilmiyor.istediği tüm çağrılan
		 * tüm değişkenler mammal ve üzerinden gelir. söz gelimi c2. deyip bekleyince
		 * cat class ı içerisindeki değişkenleri görmemeye başlar. ama metodda constructor
		 * yani --new Cat("x"); kısmındaki Cat kısmı konstruktor olduğu için
		 * o catten başlar, mammal(değişken) dan başlamaz. cat(metod)dan başlar
		 * 
		 */

		c2.mA();
		c2.mC();
		c2.mM();
		System.out.println();
		
		Mammal m1=new Mammal();
		
		System.out.println(m1.a);
		System.out.println(m1.c);
		System.out.println(m1.m);
		
		m1.mA();
		m1.mC();
		m1.mM();
		
		System.out.println();
		Animal c3=new Cat();
		
		System.out.println(c3.a);
		System.out.println(c3.m);
		
		c3.mA();
		c3.mM();
		
		
		
		
	}
}
