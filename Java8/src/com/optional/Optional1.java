package com.optional;

import java.util.Optional;

class Student {

	String name;
	int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
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

}

public class Optional1 {

	public static void main(String[] args) {

		Student s = new Student("Nikii", 25);
		Optional<String> studentName = getStudentName(s);
		System.out.println("Get:"+studentName.get());
		System.out.println("Is present:"+studentName.isPresent());
		Student s1 = new Student(null, 25);
		Optional<String> studentName1 = getStudentName(s1);
		System.out.println("Or Else:" + studentName1.get());
		Student s2 = new Student(null, 25);
		Optional<String> studentName2 = getStudentName2(s2);
		System.out.println("Or Else Get:" + studentName2.orElseGet(() -> "Def-90"));
		Optional<String> studentName3 = getStudentName2(s2);
		System.out.println(
				"Or Else throw:" + studentName3.orElseThrow(() -> new RuntimeException("No such name present:")));

	}

	private static Optional<String> getStudentName2(Student s2) {
		return Optional.ofNullable(s2.getName());
	}

	private static Optional<String> getStudentName(Student s) {

		return Optional.of(Optional.ofNullable(s.getName()).orElse("DEF-Nikiki"));

	}

}
