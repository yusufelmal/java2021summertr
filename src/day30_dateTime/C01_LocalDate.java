package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate tarih=LocalDate.now();
		System.out.println(tarih);
		
		
		System.out.println(tarih.plusDays(21) );
		
		System.out.println(tarih.plusYears(3) );

		System.out.println(tarih.plusDays(3).plusMonths(5).plusYears(2 ));
		
		System.out.println(tarih.minusDays(43) );
		
		System.out.println(tarih.minusYears(5).plusMonths(2).plusWeeks(3));
		System.out.println(tarih.getDayOfMonth() );
		System.out.println(tarih.getDayOfWeek());
		System.out.println(tarih.getMonthValue());
		System.out.println(tarih.getMonth());
		
		LocalDate dgmGunum=LocalDate.of(1987, 3, 14);
		
		System.out.println(dgmGunum.getDayOfWeek());
		
		System.out.println(tarih.isAfter(dgmGunum));
		System.out.println(tarih.isBefore(dgmGunum));
		System.out.println(tarih.isLeapYear());
	}

}
