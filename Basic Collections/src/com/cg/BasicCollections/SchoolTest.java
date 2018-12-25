package com.cg.BasicCollections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class SchoolTest {
	private School school1, school2, school3, school4;

	@Before
	public void setUp() {
		school1 = new School("Euro", "Airoli", "Thane", 4);
		school2 = new School("silver okas", "Hyderabad", "madchal", 1);
		school3 = new School("silver okas", "Hyderabad", "madchal", 3);
		school4 = new School("KTS", "Achampet", "MBNR", 2);
	}
	
	/**
	 * Test case for printing with duplicates.
	 */
	@Test
	public void schoolDetailsWithDuplicates() {
		ArrayList<Object> schoolDetails = new ArrayList<Object>();
		schoolDetails.add(school1);
		schoolDetails.add(school2);
		schoolDetails.add(school3);
		schoolDetails.add(school4);
		Iterator<Object> iteration = schoolDetails.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

	/**
	 * Test case for printing without duplicates.
	 */
	@Test
	public void schoolDetailsWithoutDuplicates() {
		HashSet<Object> schoolDetails = new HashSet<Object>();
		schoolDetails.add(school1);
		schoolDetails.add(school2);
		schoolDetails.add(school3);
		schoolDetails.add(school4);
		Iterator<Object> iteration = schoolDetails.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

}
