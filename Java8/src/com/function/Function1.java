package com.function;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Function1 {

	public static void main(String[] args) {

		f1();

		Function<Integer, Integer> s2 = i -> i * i;
		System.out.println(s2.apply(20));

		Function<String, String> s3 = s -> s.replaceAll("A", "a");
		System.out.println(s3.apply("AnkiiAnu"));

		Function<String, String> s4 = s -> s.trim();
		System.out.println(s4.apply(" Ankii An u ").trim());

		System.out.println(s3.andThen(s4).apply("Aniki a iii"));
		System.out.println(s4.andThen(s3).apply("Aniki a iii"));
		System.out.println(s3.compose(s4).apply("Aniki a iii"));

		Function<Integer, Integer> add = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				System.out.println(t + 20 - 4);
				return t;
			}
		};

		add.apply(20);
		System.out.println();
		identityFun();
	}

	private static void identityFun() {
		List<String> names = Stream.of("John", "Jane", "Jack", "Jill").map(Function.identity())
				.collect(Collectors.toList());

		System.out.println("Names after applying identity function: " + names);
	}

	private static void f1() {
		Function<String, String> s1 = new Function<String, String>() {

			@Override
			public String apply(String t) {
				if (t.endsWith("X"))
					return "Yes";

				else
					return "No";
			}
		};
		System.out.println(s1.apply("Nikki ZargX"));
	}

}
