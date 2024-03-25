package com.streams.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {

		List<Integer> lists = Arrays.asList(0, 1, 2, 5, 10, 8, 6, 90, 46, 79);
		List<String> listCourse = Arrays.asList("Spring", "Java", "Java 8", "Spring boot");
		System.out.println("Orignal list: " + lists);
		limitTop2(lists);
		skipTop3(lists);
		List<Integer> list1 = Arrays.asList(1, 2, 5, 10, 8, 6, 90, 46, 79);
		takeWhile(list1);
		dropWhile(lists);
		maxValueRes(list1);
		maxValueReverseRes(list1);
		minValueRes(list1);
		minValueReverseRes(list1);
		joining(listCourse);
		toUppercase(listCourse);
		streamofNullable();
		String[] names = { "Cbhf", "hr", "ig", "khrx" };
		arraysToUpperCase(names);
		rangeClosed();
		comparingMinValue();

	}

	private static void comparingMinValue() {
		Integer integer = List.of(9, 4, 3, 0, 2).stream().min((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println("Inside comparingMinValue :: " + integer);
		Integer integer2 = List.of(9, 4, 3, 0, 2).stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println("Inside comparingMaxValue :: " + integer2);
	}

	private static void rangeClosed() {
		System.out.println("Inside rangeClosed :: ");
		IntStream.rangeClosed(0, 5).boxed().map(String::valueOf).map(s -> s.concat("-")).forEach(System.out::print);
	}

	private static void arraysToUpperCase(String[] names) {
		System.out.println("Inside arraysToUpperCase :: ");
		Arrays.stream(names).map(String::toUpperCase).forEach(System.out::println);
	}

	private static void streamofNullable() {
		System.out.println("Inside streamofNullable :: ");
		String myVal = "Ju";
		Stream.ofNullable(myVal).forEach(System.out::println);
		Stream.empty().forEach(System.out::println);

	}

	private static void toUppercase(List<String> listCourse) {
		System.out.println("Inside toUppercase :: ");
		listCourse.replaceAll(s -> s.toUpperCase());

	}

	private static void joining(List<String> listCourse) {
		String collect = listCourse.stream().collect(Collectors.joining("|"));
		System.out.println("Inside joining :: " + collect);
	}

	private static void minValueReverseRes(List<Integer> list1) {
		Optional<Integer> max = list1.stream().min(Comparator.reverseOrder());
		System.out.println("Inside minValueReverseRes :: " + max.get());
	}

	private static void minValueRes(List<Integer> list1) {
		Optional<Integer> max = list1.stream().min(Comparator.naturalOrder());
		System.out.println("Inside minValueRes :: " + max.get());
	}

	private static void maxValueReverseRes(List<Integer> list1) {
		Optional<Integer> max = list1.stream().max(Comparator.reverseOrder());
		System.out.println("Inside maxValueReverseRes :: " + max.get());
	}

	private static void maxValueRes(List<Integer> list1) {
		Optional<Integer> max = list1.stream().max(Comparator.naturalOrder());
		System.out.println("Inside maxValueRes :: " + max.get());
	}

	private static void dropWhile(List<Integer> lists) {
		System.out.println("Inside dropWhile :: ");
		lists.stream().dropWhile(x -> x % 2 == 0).forEach(System.out::println);

	}

	private static void takeWhile(List<Integer> list1) {
		System.out.println("Inside takeWhile :: ");
		list1.stream().takeWhile(x -> x % 2 == 0).forEach(System.out::println);

	}

	private static void skipTop3(List<Integer> lists) {
		System.out.println("Inside skipTop 3 :: ");
		lists.stream().skip(3).forEach(System.out::println);

	}

	private static void limitTop2(List<Integer> lists) {
		System.out.println("Inside limitTop 2 :: ");
		lists.stream().limit(2).forEach(System.out::println);

	}
}
