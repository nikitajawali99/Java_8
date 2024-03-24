package com.optional;

import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) throws Exception {

		Optional<Student> s = Optional.empty();
		System.out.println("Optional empty :"+s);
		Optional<Student> s1 = Optional.ofNullable(null);
		System.out.println("Optional ofNullable :"+s1);
		System.out.println("Optional ofNullable is present :"+s1.isPresent());
		System.out.println("Optional ofNullable is empty :"+s1.isEmpty());
		Optional<Student> s2 = Optional.of(null);
		System.out.println("Optional of is present :"+s2.isPresent());
		System.out.println("Optional of is empty :"+s2.isEmpty());
		System.out.println("Optional of :"+s2);

	}
}
