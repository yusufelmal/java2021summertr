package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_LocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime zaman = LocalTime.now();
		System.out.println(zaman);

		LocalTime time1 = LocalTime.of(12, 35, 23);

		System.out.println(time1);

		System.out.println(zaman.plusHours(3).minusMinutes(24).plusSeconds(45));

		for (int i = 0; i < 10000; i++) {
			System.out.print(i);
		}
System.out.println();
		LocalTime zaman2 = LocalTime.now();
		System.out.println(zaman2);
		
		ZonedDateTime baskaUlke= ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(baskaUlke);
	}

}
