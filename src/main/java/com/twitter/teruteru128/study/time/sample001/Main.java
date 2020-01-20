package com.twitter.teruteru128.study.time.sample001;

import java.time.Clock;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ZoneId id = ZoneId.of("Asia/Tokyo");
		Clock clock = Clock.fixed(
				ZonedDateTime.of(2018, 3, 31, 17, 14, 35, 0, id)
						.truncatedTo(ChronoUnit.DAYS).toInstant(), id);
		OffsetDateTime time1 = OffsetDateTime.now(clock);
		OffsetDateTime time2 = time1.plus(2, ChronoUnit.YEARS);
		OffsetDateTime time3 = time1.plus(365 * 2, ChronoUnit.DAYS);
		System.out.printf("基準    : %s%n", time1);
		System.out.printf("2年後   : %s%n", time2);
		System.out.printf("730日後 : %s%n", time3);
		LocalDate date1 = LocalDate.now(clock);
		LocalDate date2 = date1.plus(2, ChronoUnit.YEARS);
		LocalDate date3 = date1.plus(365 * 2, ChronoUnit.DAYS);
		System.out.printf("基準    : %s%n", date1);
		System.out.printf("2年後   : %s%n", date2);
		System.out.printf("730日後 : %s%n", date3);
	}

}
