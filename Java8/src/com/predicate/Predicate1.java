package com.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {

		Predicate<String> s1 = s -> s.length() < 9;
		System.out.println(s1.test("Niki"));

		Predicate<Integer> s2 = s -> s % 2 == 0;
		System.out.println(s2.test(21));

		Predicate<Integer> s4 = s -> s % 2 == 0;
		System.out.println(s4.negate().test(21));

		Predicate<String> s3 = s -> s.length() > 5 && s.startsWith("GA");
		System.out.println(s3.test("GA78968574635"));

		System.out.println("And :" + s1.and(s3).negate().test("GA79722H"));

		System.out.println("Or:" + s1.or(s3).test("GA79722H"));

		Predicate<Collection> list = s -> s.isEmpty();
		List<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(8);
		a.add(24);
		System.out.println(list.negate().test(a));

		Predicate<String> p = Predicate.isEqual("Niki");
		System.out.println(p.test("Nii"));

	}

}
