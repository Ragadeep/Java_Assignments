package com.cg.BasicCollections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class CellPhoneTest {
	private CellPhone phone1, phone2, phone3, phone4;

	@Before
	public void setUp() {
		phone1 = new CellPhone("oneplus", "op3T", "smart phone", "Android Oreo", 30000);
		phone2 = new CellPhone("Apple", "iphone10", "smart phone", "ios", 70000);
		phone3 = new CellPhone("oneplus", "op3T", "new mobile", "Android Oreo", 60000);
		phone4 = new CellPhone("oneplus", "op3", "smart phone", "Android Oreo", 30000);
	}
	
	/**
	 * Test case for printing with duplicates.
	 */
	@Test
	public void diplaymobileFeaturesWithDuplicates() {
		ArrayList<Object> phoneFeatures = new ArrayList<Object>();
		phoneFeatures.add(phone1);
		phoneFeatures.add(phone2);
		phoneFeatures.add(phone3);
		phoneFeatures.add(phone4);
		Iterator<Object> iteration = phoneFeatures.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

	/**
	 * Test case for printing without duplicates.
	 */
	@Test
	public void diplayCellPhonesWithoutDuplicates() {
		HashSet<Object> phoneFeatures = new HashSet<Object>();
		phoneFeatures.add(phone1);
		phoneFeatures.add(phone2);
		phoneFeatures.add(phone3);
		phoneFeatures.add(phone4);
		Iterator<Object> iteration = phoneFeatures.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

}
