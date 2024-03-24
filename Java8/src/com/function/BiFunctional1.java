package com.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctional1 {

	public static void main(String[] args) {

		BiFunction<String, String, String> s = (s1, s2) -> s1.concat(s2);
		System.out.println(s.apply("Infosys -", "Limited"));

		BiFunction<String, String, String> s2 = (s1, s3) -> s1.substring(0, 3);
		System.out.println(s2.apply("Infosys -", "Limited"));

		Function<String, String> s3 = s0 -> s0.replaceAll("A", "a");
		System.out.println(s3.apply("AnkiiAnu"));

		System.out.println(s.andThen(s3).apply("Nikii", "Jawali"));

		BiFunction<String, Integer, Integer> res = new BiFunction<String, Integer, Integer>() {

			@Override
			public Integer apply(String t, Integer u) {
				Integer s = Integer.parseInt(t);
				return u + s;
			}
		};
		System.out.println(res.apply("90", 90));

	}
}
