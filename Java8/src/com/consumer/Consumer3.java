package com.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Student {

	private String name;
	private String gender;
	private String location;
	private List<String> activities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

	public Student(String name, String gender, String location, List<String> activities) {
		super();
		this.name = name;
		this.gender = gender;
		this.location = location;
		this.activities = activities;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", location=" + location + ", activities=" + activities
				+ "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}

public class Consumer3 {

	public static List<Student> getAllStudents() {

		Student s = new Student("Niki", "Female", "Mumbai", Arrays.asList("Swimming", "Badminton"));
		Student s1 = new Student("Amit", "Male", "Pune", Arrays.asList("Driving", "Volleyball", "Dancing"));
		Student s2 = new Student("Payal", "Female", "Indore", Arrays.asList("Badminton", "Basketball"));
		Student s3 = new Student("Nilesh", "Male", "Chennai", Arrays.asList("Driving", "Basketball"));
		Student s4 = new Student("Priya", "Female", "Mumbai", Arrays.asList("Volleyball", "Basketball"));

		
		List<Student> list = Arrays.asList(s, s1, s2,s3,s4);
		return list;
	}

	public static void printStudent() {

		Consumer<Student> s = c -> System.out.println(c);
		List<Student> s1 = getAllStudents();
		s1.forEach(s);
	}

	public static void printStudentWithActivities() {
		Consumer<Student> s1 = c -> System.out.println(c);
		Consumer<Student> s2 = c -> c.getLocation().equals("Mumbbai");
		List<Student> list = getAllStudents();

		list.forEach(s -> {

			if (s.getGender().equals("Female") || s.getActivities().equals("Badminton")) {

				s1.andThen(s2).accept(s);
			}
		});
	}

	public static void main(String[] args) {

		printStudentWithActivities();
		System.out.println();
		printStudent();
	}

}
