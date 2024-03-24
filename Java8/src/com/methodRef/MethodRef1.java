package com.methodRef;

@FunctionalInterface
interface Interf {

	public void m1();

}

public class MethodRef1 implements Interf {

	public MethodRef1() {
		System.out.println("MethodRef1 constructor::");
	}
	
	public static void m2() {
		System.out.println("Inside static m2");
	}

	public static void main(String[] args) {

		Interf r = MethodRef1::m2;
		r.m1();
		Interf r1 = MethodRef1::new;
		r1.m1();
	}

	@Override
	public void m1() {
		System.out.println("Inside m1");
	}

}
