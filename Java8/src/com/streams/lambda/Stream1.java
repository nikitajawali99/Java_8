package com.streams.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Stream1 {

	public static void main(String[] args) {

		List<String> listCourse = List.of("Spring", "Java", "Java 8", "Spring boot","SQL");
		List<Integer> lists = Arrays.asList(1, 2, 5, 10, 8, 6,90,46,79);
		printDis(lists);
		printAndMap(lists);
		sumUsingReduce(lists);
		sumUsingLamdaReduce(lists);
		sumUsingMethodRefReduce(lists);
		sortRes(lists);
		
		sortResUsingNatural(lists);
		sortResUsingReverse(lists);
		sortResUsingComparatorComparing(lists);
		filterRes();
		collectList(lists);
		resToUpperCaseUsingLambda(listCourse);
		resToUpperCaseUsingMethRef(listCourse);
		resWithAnyMatch(lists);
		resWithNoMatch(lists);
		resWithAllMatch(lists);
	}

	private static void resWithAllMatch(List<Integer> lists) {
		Predicate<? super Integer> predicate = x -> x%2==0;
		boolean anyMatch = lists.stream().filter(predicate).allMatch(x -> x >60);
		System.out.println("Inside resWithAllMatch:: "+anyMatch);
	}

	private static void resWithNoMatch(List<Integer> lists) {
		Predicate<? super Integer> predicate = x -> x%2==0;
		boolean anyMatch = lists.stream().filter(predicate).noneMatch(x -> x >60);
		System.out.println("Inside resWithNoMatch:: "+anyMatch);
	}

	private static void resWithAnyMatch(List<Integer> lists) {
		Predicate<? super Integer> predicate = x -> x%2==0;
		boolean anyMatch = lists.stream().filter(predicate).anyMatch(x -> x >60);
		System.out.println("Inside resWithAnyMatch:: "+anyMatch);
	}

	private static void resToUpperCaseUsingMethRef(List<String> listCourse) {
		System.out.println("Inside resToUpperCaseUsingMethRef:: ");
		listCourse.stream().map(String::toUpperCase).forEach(System.out::println);
	}

	private static void resToUpperCaseUsingLambda(List<String> listCourse) {
		System.out.println("Inside resToUpperCaseUsingLambda:: ");
		listCourse.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
	}

	private static void collectList(List<Integer> lists) {

		List<Integer> collect = lists.stream().map(x -> x * x * x).collect(Collectors.toList());
		System.out.println("Inside collectList:: " + collect);
	}

	private static void sortResUsingComparatorComparing(List<Integer> lists) {
		System.out.println("Inside sortResUsingComparatorComparing::start ");
		lists.stream().sorted(Comparator.comparing(s -> s >5)).forEach(System.out::println);
		System.out.println("Inside sortResUsingComparatorComparing::end ");
	}

	private static void sortResUsingReverse(List<Integer> lists) {
		System.out.println("Inside sortResUsingReverse:: ");
		lists.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

	private static void sortResUsingNatural(List<Integer> lists) {
		System.out.println("Inside sortResUsingNatural:: ");
		lists.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
	}

	private static void sortRes(List<Integer> lists) {
		System.out.println("Inside sortRes:: ");

		lists.stream().sorted().forEach(System.out::println);
	}

	private static void filterRes() {
		List<String> listCourse = List.of("Spring", "Java", "Java 8", "Spring boot");

		listCourse.stream().filter(x -> x.contains("Java")).forEach(System.out::println);
	}

	public static int sum(int x, int y) {
		int z = x + y;
		return z;
	}

	private static void sumUsingMethodRefReduce(List<Integer> lists) {
		Optional<Integer> reduce = lists.stream().reduce(Stream1::sum);
		System.out.println("Inside sumUsingMethodRefReduce:: " + reduce.get());

	}

	private static void sumUsingLamdaReduce(List<Integer> lists) {
		Integer reduce = lists.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Inside sumUsingLamdaReduce:: " + reduce);
	}

	private static void sumUsingReduce(List<Integer> lists) {
		Integer reduce = lists.stream().reduce(0, Integer::sum);
		System.out.println("Inside sumUsingReduce:: " + reduce);
	}

	private static void printAndMap(List<Integer> lists) {
		System.out.println("Inside printAndMap:: ");
		lists.stream().filter(x -> x % 2 == 0).map(n -> n * n).forEach(System.out::println);

	}

	private static void printDis(List<Integer> lists) {
		System.out.println("Inside printDis:: ");
		lists.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

	}

}
