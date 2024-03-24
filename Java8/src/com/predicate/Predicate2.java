package com.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {

		String[] names = { "Niki", "Rohan", null, "Kii7", "Ri", "Sagayuiugjhc", null };

		Predicate<String> s = s1 -> s1 != null && s1.length() > 3 && !s1.isBlank();
		List<String> list = new ArrayList<>();
		for (String string : names) {
			if (s.test(string)) {
				list.add(string);
			}
		}

		System.out.println("Valid names :" + list);
		
		Predicate<List<Integer>> res = new Predicate<>() {
			
			@Override
			public boolean test(List<Integer> t) {
				
				if(t.get(0)%2==0) return true;
			
				else return false;
			}
		};
		
		System.out.println(res.test(Arrays.asList(1,2,5,78,214,89,97)));

	}

}
