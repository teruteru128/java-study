package com.twitter.teruteru128.study.white;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate endOfDate = LocalDate.of(2020, 7, 24);
		Period period = today.until(endOfDate);
		System.out.println(period);
		System.out.println(period.getDays());
		System.out.println(today.until(endOfDate, ChronoUnit.DAYS));
	}

}
