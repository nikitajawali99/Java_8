package com.consumer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {

		Consumer<Integer> s12 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t - 4);

			}
		};
		s12.accept(40);

		Consumer<String> s = s1 -> System.out.println(s1.toUpperCase());
		s.accept("nikii");

		Consumer<String> s2 = s1 -> System.out.println(s1.concat("*95"));
		s2.accept("Niki");

		Consumer<String> s5 = s90 -> s90.substring(0, 4);
		s5.accept("Niki");

		Consumer<List<Integer>> list = l -> Collections.sort(l);
		List<Integer> list1 = Arrays.asList(12, 11, 9, 47, 45, 90);
		list.accept(list1);
		System.out.println(list1);

		Consumer<String> s3 = s.andThen(s2).andThen(s5);
		s3.accept("RKT_College");

		Consumer<String> s4 = s2.andThen(s);
		s4.accept("RKT_College");

	}
}
