package com.cg.BasicCollections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	private Car car1, car2, car3, car4, car5;
	/**
	 * objects
	 */
	@Before
	public void setUp() {
		car1 = new Car("Tata", "Tata800", 2018, 30000);
		car2 = new Car("Fiat", "Fiat234", 2016, 20000);
		car3 = new Car("Tata", "Tata800", 2017, 36000);
		car4 = new Car("Fiat", "Fiat234", 2018, 29000);
		car5 = new Car("BMW", "BMW8", 2017, 39000);
	}
	
	/**
	 * Test case to print details with duplicates.
	 */
	@Test
	public void carDetailsWithDuplicates() {
		ArrayList<Object> carDetails = new ArrayList<Object>();
		carDetails.add(car1);
		carDetails.add(car4);
		carDetails.add(car3);
		carDetails.add(car2);
		carDetails.add(car5);
		Iterator<Object> iteration = carDetails.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

	/**
	 * Test case to print details without duplicates.
	 */
	@Test
	public void carDetailsWithoutDuplicates() {
		HashSet<Object> carDetails = new HashSet<Object>();
		carDetails.add(car1);
		carDetails.add(car4);
		carDetails.add(car3);
		carDetails.add(car2);
		carDetails.add(car5);
		Iterator<Object> iteration = carDetails.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

}
