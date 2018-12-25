/**
 * 
 */
package com.cg.BasicCollections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {
	private Television television1, television2, television3, television4;
	/**
	 * Objects
	 * This objects excute before each and every test case
	 */
	@Before
	public void setUp() {
		television1 = new Television("onida", "onida123", true, 30000);
		television2 = new Television("LG", "LG 45", false, 39000);
		television3 = new Television("onida", "onida123", true, 34000);
		television4 = new Television("onida", "onida123", false, 30000);
	}

	/**
	 * Test case for printing with duplicates.
	 */
	@Test
	public void displayTvDetailsWithDuplicates() {
		ArrayList<Object> tvDetails = new ArrayList<Object>();
		tvDetails.add(television1);
		tvDetails.add(television2);
		tvDetails.add(television3);
		tvDetails.add(television4);
		Iterator<Object> iteration = tvDetails.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

	/**
	 * Test case for printing without duplicates.
	 */
	@Test
	public void displayTvDetailsWithoutDuplicates() {
		HashSet<Object> tvDetails = new HashSet<Object>();
		tvDetails.add(television1);
		tvDetails.add(television2);
		tvDetails.add(television3);
		tvDetails.add(television4);
		Iterator<Object> iteration = tvDetails.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

}
