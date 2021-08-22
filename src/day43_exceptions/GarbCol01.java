package day43_exceptions;

public class GarbCol01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str="";
	
	for (int i = 0; i < 3; i--) {
		str+=i;
		System.out.println(i);
		
		//bu sonsuz döngüde finalize()i çağırıyor. kendi 
		//kafasına göre temizleme yapıyor heap memoryde.
		//finalize() metodu işaretler silinecekleri sonra da siler
		
		
		
	}
	}

}
