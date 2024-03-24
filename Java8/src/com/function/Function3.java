package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Emp {

	String name;
	String location;
	double salary;

	@Override
	public String toString() {
		return "Emp [name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, String location, double salary) {
		super();
		this.name = name;
		this.location = location;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class Function3 {

	public static void main(String[] args) {

		List<Emp> populate = populate();

		Predicate<Emp> e = e1 -> e1.getLocation().equals("Mumbai") && e1.getSalary() > 70000;
		Consumer<Emp> e2 = e3 -> System.out.println(e3);
		Function<Emp, Double> e3 = e4 -> e4.getSalary() + 7000.0;

		for (Emp emp : populate) {

			if (e.test(emp)) {
				Double apply = e3.apply(emp);
				emp.setSalary(apply);
				e2.accept(emp);
			}
		}
	}

	private static List<Emp> populate() {
		List<Emp> l = new ArrayList<>();
		l.add(new Emp("Nikii", "Mumbai", 80000));
		l.add(new Emp("Raj", "Mumbai", 90000));
		l.add(new Emp("Sagar", "Pune", 76000));
		l.add(new Emp("Aname", "Hyderabad", 97000));
		l.add(new Emp("Dhanu", "Mumbai", 57000));
		return l;
	}
}
