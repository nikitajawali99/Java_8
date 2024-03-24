package com.defaultEx;

interface Demo1 {

	default void m1() {
		System.out.println("Default ::m1");
	}
}

interface Demo2 {

	default void m2() {
		System.out.println("Default ::m2");
	}
}

public class Default1 implements Demo1, Demo2 {

	public void m1() {
		System.out.println("Default-child ::m1");
	}

	public void m2() {
		System.out.println("Default-child ::m2");
	}

	public static void main(String[] args) {

		Default1 t = new Default1();
		t.m1();
		t.m2();
		System.out.println();
		Demo1 t1 = new Default1();
		t1.m1();
		System.out.println();
		Demo2 t2 = new Default1();
		t2.m2();
		System.out.println();
		Demo1 t3 = new Demo1() {
		};
		t3.m1();
	}
}
