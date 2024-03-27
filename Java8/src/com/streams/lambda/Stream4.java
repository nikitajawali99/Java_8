package com.streams.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Course {

	private String name;
	private String category;
	private int noOfStudent;

	public Course() {
		super();
	}

	public Course(String name, String category, int noOfStudent) {
		super();
		this.name = name;
		this.category = category;
		this.noOfStudent = noOfStudent;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", noOfStudent=" + noOfStudent + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

}

public class Stream4 {

	public static void main(String[] args) {

		List<Course> courses = Arrays.asList(new Course("Microservices", "Backend", 20), new Course("AWS", "Cloud", 10),
				new Course("Angular", "Frontend", 7), 
				new Course(null, null, 15),
				new Course("Kubernates", "Cloud", 15),
				new Course("React js", "Frontend", 7));
		
		Comparator<Course> s1 = Comparator.nullsFirst(Comparator.comparing(Course::getName));
		System.out.println(s1.toString());
		
		
		Comparator<Course> c = Comparator.comparing(Course::getName);
		courses.sort(c);
		courses.forEach(System.out::println);
		System.out.println();
		
		Comparator<Course> c1 =Comparator.comparingInt(Course::getNoOfStudent).thenComparing(c);
		courses.sort(c1);
		courses.forEach(System.out::println);
		System.out.println();
		
		

		Optional<Course> collect2 = courses.stream()
				.collect(Collectors.minBy(Comparator.comparing(Course::getNoOfStudent)));
		System.out.println("Collect2 min ::" + collect2.get());
		
		Optional<Course> collect3= courses.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Course::getNoOfStudent)));
		System.out.println("Collect2 max ::" + collect3.get());

		List<String> collect = courses.stream().collect(Collectors.mapping(Course::getName, Collectors.toList()));
		System.out.println("Collect ::" + collect);

		System.out.println(courses.stream().map(Course::getName).collect(Collectors.toList()));

		Comparator<Course> comparing = Comparator.comparing(Course::getName);
		System.out.println(
				courses.stream().filter(x -> x.getNoOfStudent() > 10).mapToInt(Course::getNoOfStudent).average());
		System.out
				.println(courses.stream().filter(x -> x.getNoOfStudent() > 10).mapToInt(Course::getNoOfStudent).sum());
		System.out.println(
				courses.stream().filter(x -> x.getNoOfStudent() > 10).mapToInt(Course::getNoOfStudent).count());

		Comparator<Course> comparingByNoOfStudents = Comparator.comparing(Course::getNoOfStudent).reversed();
		System.out.println("comparingByNoOfStudents :" + comparingByNoOfStudents);

		System.out.println(courses.stream().sorted(comparing).collect(Collectors.toList()));
		System.out.println(courses.stream().sorted(Comparator.comparing(Course::getCategory).reversed())
				.collect(Collectors.toList()));

		System.out.println();
		System.out.println(courses.stream().filter(x -> x.getNoOfStudent() >= 10).min(comparing)
				.orElse(new Course("Def-Microservices", "Def-Backend", 20)));
		System.out.println(courses.stream().filter(x -> x.getName().contains("A")).findAny());
		System.out.println(courses.stream().filter(x -> x.getName().contains("A")).findFirst());
	}

	private static Collector minBy(Comparator<Course> comparing) {
		// TODO Auto-generated method stub
		return null;
	}

}
