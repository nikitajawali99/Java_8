package com.streams.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {

	String name;
	int id;
	int age;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Stream6 {

	public static void main(String[] args) {

		List<Person> peopleLists = Arrays.asList(new Person("Niki", 5575, 25), new Person("Rohan", 5075, 20),
				new Person("Adi", 1264, 27), new Person("Shyam", 3496, 23));

		Stream<String> names = Stream.of("Thomas", "Mie", "Peter", "Alan");
		Map<Boolean, List<String>> collect2 = names.collect(Collectors.partitioningBy(s -> s.startsWith("T")));
		System.out.println("1 :" + collect2);

		Stream<String> names4 = Stream.of("Thomas", "Mie", "Peter", "Alan");
		Map<Boolean, Long> collect5 = names4
				.collect(Collectors.partitioningBy(s -> s.startsWith("T"), Collectors.counting()));
		System.out.println("collect5:" + collect5);

		Stream<String> names2 = Stream.of("Thomas", "Mie", "Peter", "Alan");
		Map<Boolean, List<String>> collect3 = names2.collect(Collectors.partitioningBy(s -> s.length() > 3));
		System.out.println("2 :" + collect3);

		Stream<String> names1 = Stream.of("Thomas", "Mie", "Peter", "Alan");
		Map<Boolean, List<String>> collect4 = names1
				.collect(Collectors.partitioningBy(s -> s.length() > 3, Collectors.toList()));
		System.out.println("3 :" + collect4);

		Collector c1 = Collectors.toMap(String::length, s -> s);
		System.out.println("Characteritices :" + c1.characteristics());

		Collector c2 = Collectors.toConcurrentMap(String::length, s -> s);
		System.out.println("Characteritices toMap: " + c2.characteristics());

		Collector c3 = Collectors.groupingBy(Person::getAge);
		System.out.println("Characteritices groupingBy: " + c3.characteristics());

		Map<Integer, Person> collect = peopleLists.parallelStream().collect(Collectors.toMap(Person::getId, p -> p));
		System.out.println(collect);

	}

}
