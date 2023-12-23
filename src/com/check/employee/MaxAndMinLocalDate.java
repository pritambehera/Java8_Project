package com.check.employee;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxAndMinLocalDate {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = LocalDate.now().plusWeeks(1).with(TemporalAdjusters.lastDayOfMonth());

		List<LocalDate> dList = Stream.iterate(startDate, (date) -> date.plusDays(1))
				.limit(ChronoUnit.DAYS.between(startDate, endDate)).collect(Collectors.toList());

		LocalDate maxDate = dList.stream().max(Comparator.comparing(LocalDate::toEpochDay)).get();

		LocalDate minDate = dList.stream().min(Comparator.comparing(LocalDate::toEpochDay)).get();

		System.out.println(maxDate);
		System.out.println(minDate);
	}
}
