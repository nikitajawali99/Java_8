package com.supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {

		Supplier<String> supplier = () -> "Niki";
		System.out.println(supplier.get());
		Supplier<Integer> supplier1 = () -> 7;
		System.out.println(supplier1.get());
		Supplier s1 = new Supplier<String>() {

			@Override
			public String get() {

				return "Java-8";
			}
		};
		System.out.println(s1.get());
		Supplier<StringBuilder> s2 = () -> new StringBuilder("Pune-");
		System.out.println("Append :" + s2.get().append("Nashik"));
		Supplier<LocalDate> date = () -> LocalDate.now();
		System.out.println(date.get());
		System.out.println();
		Supplier<String> otps = () -> {

			String otp = "";
			for (int i = 0; i < 3; i++) {
				otp = otp + Math.random();
			}
			return otp;

		};
		System.out.println(otps.get());

	}
}
