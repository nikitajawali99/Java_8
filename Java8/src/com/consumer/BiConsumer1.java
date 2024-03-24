package com.consumer;

import java.util.function.BiConsumer;

public class BiConsumer1 {

	public static void main(String[] args) {

		BiConsumer<String, String> t1 = (s1, s2) -> System.out.println(s1.concat(s2));
		t1.accept("Niki ", "Jawali");
		System.out.println();
		BiConsumer<String, String> t2 = (s1, s2) -> System.out.println(s1.equals(s2));
		t2.accept("Niki ", "Jawali");
		System.out.println();
		t1.andThen(t2).accept("Nikit", "Nikit");
		System.out.println();
		BiConsumer<Integer, Integer> biCons = (a, b) -> {

			System.out.println(a + b);
		};
		biCons.accept(20, 10);

	}

}
