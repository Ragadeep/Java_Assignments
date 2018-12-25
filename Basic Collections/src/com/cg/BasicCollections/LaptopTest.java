package com.cg.BasicCollections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
public class LaptopTest {
	private Laptop laptop1, laptop2, laptop3, laptop4;

	@Before
	public void setUp() {
		laptop1 = new Laptop("Hp", "xt2202", "windows", "intel");
		laptop2 = new Laptop("Apple", "Apple2018", "OS X", "A 10");
		laptop3 = new Laptop("Hp", "xt22022", "windows", "intel");
		laptop4 = new Laptop("Hp", "xt2202", "windows10", "intel 124");
	}
	
	/**
	 * Test case for printing without duplicates.
	 */
	@Test
	public void removingDuplicates() {
		HashSet<Object> laptopDetails = new HashSet<Object>();
		laptopDetails.add(laptop1);
		laptopDetails.add(laptop2);
		laptopDetails.add(laptop3);
		laptopDetails.add(laptop4);
		Iterator<Object> iteration = laptopDetails.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}
	
	/**
	 * Test case for printing with duplicates.
	 */
	@Test
	public void displayingLaptopdetailsWithDuplicates() {
		ArrayList<Object> laptopDetails = new ArrayList<Object>();
		laptopDetails.add(laptop1);
		laptopDetails.add(laptop2);
		laptopDetails.add(laptop3);
		laptopDetails.add(laptop4);
		Iterator<Object> iteration = laptopDetails.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}
}
