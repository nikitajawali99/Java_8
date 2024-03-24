package com.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Optional3 {

	public static void main(String[] args) {

		Optional<String> min = Stream.of("deer", "ping", "pig", "am").min((s3, s4) -> s3.length() - s4.length());
		System.out.println("Min :" + min.get());

		Optional<Integer> minValue = Stream.of(5, 1, 0, 9).min((s3, s4) -> s3 - s4);
		minValue.ifPresent(System.out::println);

		OptionalInt max = IntStream.of(10, 20, 13, 3, 8).max();
		boolean res = max.isPresent();
		System.out.println(res);

		DoubleStream doubleVal = DoubleStream.of(12.5, 12.5);
		double orElse = doubleVal.min().orElse(0.0);
		System.out.println(orElse);

		OptionalDouble longVal = LongStream.of(12, 16, 20).average();
		System.out.println(longVal.orElseGet(() -> Math.random()));
		
		OptionalDouble optAvg = IntStream.rangeClosed(0, 5).average();
		optAvg.ifPresent(  d -> System.out.println(d) );
		System.out.println(optAvg.getAsDouble());
		System.out.println(optAvg.orElseGet(()-> Double.NaN));
	}
}
