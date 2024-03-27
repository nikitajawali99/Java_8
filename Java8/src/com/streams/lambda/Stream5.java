package com.streams.lambda;

import java.util.Arrays;

import java.util.List;


public class Stream5 {

	public static void main(String[] args) {

		List<Integer> lists = Arrays.asList(1, 4, 1, 4, 6);
		for (int i = 1; i < 3; i++) {

			lists.parallelStream().forEachOrdered(s -> System.out.println(s + " "));
			System.out.println();

		}

	}
}
