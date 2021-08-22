package day35_encapsulationSorular;

import java.util.Scanner;

public class C05_Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* TODO
	    Burada iki adet class vardır. Biri Main 
	    diğeri ise Employees,
	    Employees(Çalışanlar) class'ında;
	    Bu variable'ları oluşturunuz;
	    private String name,
	    private int salary,
	    private String dob (date of birth) (Doğum tarihi)
	    getter ve setter oluşturunuz.
	 Main class'ın içinde; kullanicidan name dob ve slary 
	 bilgilerini alip
	    Eğer employee 18 yaşında büyükse, Welcome to our company 
	    Fernando your salary is 80000. yazdırınız.
	    Eğer Fernando 18 yaşından küçükse, come back when you are 
	    18 years old. yazdırınız.
	    Eğer Fernando 18 yaşındaysa,  we can have inter with 
	    you after that you can have a 80000 salary yazdırınız.
	  Örnek:
	    Name is Fernando
	    dob is 11/23/2000
	    Salary is 80000
	todo  ageCalculator isminde bir method oluşturunuz. 
	Şuanki tarih - doğum yılı = employee age
	*/

		Scanner scan = new Scanner(System.in);
		System.out.println("adinizi giriniz : ");
		String ad=scan.nextLine();
		System.out.println("dogum tarihinizi gun ay yil olarak giriniz");
		String dob=scan.nextLine();
		System.out.println("maasinizi giriniz : ");
		int salary=scan.nextInt();
		
		C06_EmployeesMain calisan=new C06_EmployeesMain();
		calisan.setDob(dob);
		calisan.setName(ad); 
		calisan.setSalary(salary);
		
		int calisanYas=calisan.yasHesapla(dob);
		 
		if (calisanYas>18) {
			System.out.println(" Welcome to our company \n"
					+ calisan.getName()+ " your salary is 80000.");
		} else if (calisanYas<18){
			System.out.println("come back when you are \n"
					+ "	    18 years old.");
		} else if(calisanYas==18){
System.out.println("we can have inter with \n"
		+ "	    you after that you can have a 80000 salary");

		}
		
		
		 
		
				
	}

}
