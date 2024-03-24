package com.predicate;

import java.util.function.BiPredicate;

public class BiPredicate1 {
	
	public static void main(String[] args) {
		
		BiPredicate<String, Integer> s1 = (s2,s3) -> s2.length()>3 && s3%2==0;
		System.out.println(s1.test("Nikita", 980));
		
		BiPredicate<String, String> s2 = (s3,s4) -> s3.length()>3 || s4.contains("Java");
		System.out.println(s2.test("ta", "Java"));
		
		BiPredicate<String, String> s8 = (s9,s10) -> !s9.isEmpty() && s10!=null;
		System.out.println(s8.test("ta", "Java"));
		
		BiPredicate<String, String> s14 = s2.and(s8);
		System.out.println(s14.test("Mikii", "Java"));
		
		System.out.println("And :"+s2.and(s8).test("Mikii", "Java"));
		System.out.println("Or :"+s2.or(s8).test("Mikii", "C++"));
		System.out.println("Negate with or :"+s2.or(s8).negate().test("Mikii", "C++"));
		System.out.println("Negate with and :"+s2.and(s8).negate().test("Mikii", "C++"));
		
		BiPredicate<Integer, Integer> s12 = new BiPredicate<Integer, Integer>() {
			
			@Override
			public boolean test(Integer t, Integer u) {
			
				if(t%2==0 && u%2==0) return true;
				else return false;
			}
		};
		System.out.println(s12.test(20, 10));
		
	}

}
