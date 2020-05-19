package com.xinyan7788.chapter1;

public class DogTest {
	public static void main(String[] args) {
		Dog spot = new Dog();
		spot.setName("spot");
		spot.setSays("Ruff!");
		Dog scruffy = new Dog();
		scruffy.setName("scruffy");
		scruffy.setSays("Wurf!");
		spot.showName();
		spot.showSays();
		scruffy.showName();
		scruffy.showSays();
		Dog v1 = new Dog();
		v1.setName("abc");
		v1.setSays("www");
		v1.showName();
		v1.showSays();
		
		
		System.out.println(v1 == spot);
		System.out.println(spot.equals(v1));
	
		spot = v1;
		System.out.println(v1 == spot);
		System.out.println(v1.equals(spot));
		System.out.println(spot.equals(v1));
		System.out.println();
		
	}
	

}

