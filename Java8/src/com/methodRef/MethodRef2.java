package com.methodRef;

interface WorkInter {

	public void doTask();

}

public class MethodRef2 {

	public void m1() {
		System.out.println("Inside m1");
	}

	public static void m2() {
		System.out.println("Inside static m2");
	}

	public static void main(String[] args) {
		
		WorkInter i = MethodRef2::m2;
		i.doTask();
		MethodRef2 i2 = new MethodRef2();
		Runnable r = i2::m1;
		Thread d1 = new Thread(r);
		d1.start();
		
	}

}
