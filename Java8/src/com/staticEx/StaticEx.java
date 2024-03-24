package com.staticEx;

interface Interf {

	public static void m1() {
		System.out.println("Inside static m1");
	}

	public static void m2() {
		System.out.println("Inside static m2");
	}

}

public class StaticEx implements Interf {

	public void m1() {
		System.out.println("Inside static m1-child");
	}

	public static void m2() {
		System.out.println("Inside static m2-child");
	}

	public static void main(String[] args) {

		StaticEx s = new StaticEx();
		s.m1();
		Interf.m1();
		Interf.m2();
		StaticEx.m2();
	}

}
