package com.consumer;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPredicate4 {

	public static void main(String[] args) {

		Predicate<String> s = s1 -> s1.length() > 4 && s1.contains("GA");
		Consumer<String> s1 = s2 -> System.out.println(s2.concat("DEL-2"));

		boolean test = s.test("GACI-4");
		if (test) {
			s1.accept("NIKI-99 | ");
		}
	}
}
