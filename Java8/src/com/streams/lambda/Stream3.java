package com.streams.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream3 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 5, 10, 6, 90, 46, 79, 5, 10, 2);
		List<String> listCourse = Arrays.asList("Spring", "Java", "Java 8", "Spring boot");
		int[] numberArray = { 12, 7, 9, 13, 6, 46 };
		filterRes(numberArray);
		distinctRes(list1);
		comparingUsingLength(listCourse);
		collectToSet(list1);
		predicateFunction(list1);
		count(list1);
		rangeAndRangeClosed();

	}

	private static void rangeAndRangeClosed() {
		IntStream range = IntStream.range(0, 5);
		range.forEach(System.out::println);
		int rangeSum = IntStream.range(0, 5).sum();
		System.out.println("Inside rangeAndRangeClosed sum:" + rangeSum);
		OptionalDouble rangeDouble = IntStream.range(0, 5).average();
		System.out.println("Inside rangeAndRangeClosed average:" + rangeDouble.getAsDouble());
		IntStream rangeClosed = IntStream.rangeClosed(0, 5);
		rangeClosed.forEach(System.out::println);
		OptionalInt rangeClosedMax = IntStream.rangeClosed(0, 5).max();
		System.out.println("Inside rangeAndRangeClosed closed max:" + rangeClosedMax);
		OptionalInt rangeClosedMin = IntStream.rangeClosed(0, 5).min();
		System.out.println("Inside rangeAndRangeClosed closed min:" + rangeClosedMin);
		System.out.println();
		IntStream.iterate(1, e -> e + 2).limit(5).peek(System.out::println).sum();

	}

	private static void filterRes(int[] numberArray) {
		int sum = Arrays.stream(numberArray).sum();
		System.out.println("Inside filterRes sum :: " + sum);
		OptionalInt max = Arrays.stream(numberArray).max();
		System.out.println("Inside filterRes max :: " + max.getAsInt());
		OptionalInt min = Arrays.stream(numberArray).min();
		System.out.println("Inside filterRes min:: " + min.getAsInt());
		OptionalDouble average = Arrays.stream(numberArray).average();
		System.out.println("Inside filterRes average:: " + average.getAsDouble());
	}

	private static void count(List<Integer> list1) {

		long count = list1.stream().count();
		System.out.println("Inside predicateFunction :: " + count);
	}

	private static void predicateFunction(List<Integer> list1) {
		System.out.println("Inside predicateFunction :: ");
		Predicate<Integer> list2 = x -> x % 2 == 0;
		Function<Integer, Integer> list3 = n -> n * n;
		list1.stream().distinct().filter(list2).map(list3).forEach(System.out::println);

	}

	private static void collectToSet(List<Integer> list1) {
		Set<Integer> collectToSet = list1.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
		System.out.println("Inside collectToSet :: " + collectToSet);
		List<Integer> collectToList = list1.stream().distinct().filter(x -> x % 2 == 0).sorted()
				.collect(Collectors.toList());
		System.out.println("Inside collectToList :: " + collectToList);
	}

	private static void comparingUsingLength(List<String> listCourse) {
		System.out.println("Inside comparingUsingLength :: ");
		listCourse.stream().sorted(Comparator.comparing(s -> s.length())).forEach(System.out::println);
	}

	private static void distinctRes(List<Integer> list1) {
		System.out.println("Inside distinctRes :: ");
		list1.stream().distinct().filter(x -> x % 2 == 0).forEach(System.out::println);
	}
}
