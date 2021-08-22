package day35_encapsulationSorular;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C06_EmployeesMain {



		private String name;
		private int salary;
		private String dob;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		
		public int yasHesapla(String dob) {
		String strDate=dob;
		LocalDate bugun=LocalDate.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate dTarihi=LocalDate.parse(strDate,format);
		
		int age=bugun.getYear()-dTarihi.getYear();
		
		return age;
		
		}
}
