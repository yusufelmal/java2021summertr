package day28_staticBlocks;

public class C03_StaticBlocks03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 double fiyat=100;
	        
         // fiyatta %10 indirim yapicam ve yeni fiyati dondurucem
        
        System.out.println("method call ile yazdirilan indirimli fiyat "+indirimYap(fiyat)); // 90.0
        
        System.out.println("method calistiktan sonra fiyat : " + fiyat); // 100
        
        int zamYuzdesi=15;
        zamYap(zamYuzdesi);
    }
    private static void zamYap(int zamYuzdesi) {
        // Javaya bir method olusturtdugumuzda Java bizim main method'da kullandigimiz
        // variable isminde clone/kopya bir variable olusturur
        // bunun amaci kod takibini kolaylastirmaktir
        // bu degiskenin ismini degistirsek de kodumuz problemsiz calisir
        
    }
    private static double indirimYap(double fiyat) {
        
        fiyat=fiyat*90/100;
        System.out.println("methodda ki indirimli fiyat : " + fiyat); // 90
        
        return fiyat;

	}

}
