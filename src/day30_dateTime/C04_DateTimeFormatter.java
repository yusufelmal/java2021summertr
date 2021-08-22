package day30_dateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate tarih=LocalDate.now();
		LocalDate date=LocalDate.of(2020, 5, 15);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy");
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yy");
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd%M%yyyy");
		
		System.out.println(dtf.format(tarih));
		System.out.println(dtf1.format(date));
		System.out.println(dtf2.format(tarih));
		System.out.println(dtf3.format(date));
		System.out.println(dtf3.format(tarih));
		
		LocalDate dt=LocalDate.of(1987,9,22);
		System.out.println(tarih);
		System.out.println(dt);
		Period yasim=Period.between(dt, tarih);
		 System.out.println(yasim);
		 System.out.println(yasim.getYears());
		
		
		
	}

}
