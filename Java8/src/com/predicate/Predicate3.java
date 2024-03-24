package com.predicate;

import java.util.function.Predicate;

class SoftwareEnginnerDtls {

	String name;
	int age;
	boolean isHavingCar;

	public SoftwareEnginnerDtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SoftwareEnginnerDtls [name=" + name + ", age=" + age + ", isHavingCar=" + isHavingCar + "]";
	}

	public SoftwareEnginnerDtls(String name, int age, boolean isHavingCar) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingCar = isHavingCar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHavingCar() {
		return isHavingCar;
	}

	public void setHavingCar(boolean isHavingCar) {
		this.isHavingCar = isHavingCar;
	}

}

public class Predicate3 {

	public static void main(String[] args) {

		SoftwareEnginnerDtls[] list = {

				new SoftwareEnginnerDtls("Niki", 25, false), new SoftwareEnginnerDtls("Say", 29, true),
				new SoftwareEnginnerDtls("Ray", 22, true), new SoftwareEnginnerDtls("Sahii", 32, true),

		};

		Predicate<SoftwareEnginnerDtls> res = s -> s.getAge() > 25 && s.isHavingCar;

		for (SoftwareEnginnerDtls softwareEnginnerDtls : list) {

			if (res.test(softwareEnginnerDtls)) {
				System.out.println(softwareEnginnerDtls);

			}
		}
	}

}
