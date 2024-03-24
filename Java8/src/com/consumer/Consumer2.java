package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer2 {

	String name;
	String hero;
	String herione;

	public Consumer2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Consumer2 [name=" + name + ", hero=" + hero + ", herione=" + herione + "]";
	}

	public Consumer2(String name, String hero, String herione) {
		super();
		this.name = name;
		this.hero = hero;
		this.herione = herione;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public String getHerione() {
		return herione;
	}

	public void setHerione(String herione) {
		this.herione = herione;
	}
	
	public static void main(String[] args) {
		
		List<Consumer2> list =  new ArrayList<>();
		list.add(new Consumer2("Table 21", "Rohit", "Rani"));
		list.add(new Consumer2("Don 2", "Deepak", "Akanasha"));
		list.add(new Consumer2("Tiger 3", "Rohit", "Deepika"));
		
		Consumer<Consumer2> c = m ->{
			
			System.out.println("Movie name :"+m.name);
			System.out.println("Movie hero :"+m.hero);
			System.out.println("Movie herione :"+m.herione);
			System.out.println();
		};
		
		for (Consumer2 consumer2 : list) {
			c.accept(consumer2);
		}
		
	}

}
