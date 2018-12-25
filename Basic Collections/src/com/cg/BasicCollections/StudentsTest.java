package com.cg.BasicCollections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class StudentsTest {
	private Students student1, student2, student3, student4;

	@Test
	public void studentNamesInsertionOrder() {
		ArrayList<Object> studentName = new ArrayList<Object>();
		student1 = new Students("Shabzan");
		student2 = new Students("Bhanu");
		student3 = new Students("Nikhil");
		student4 = new Students("Ragadeep");
		studentName.add(student1);
		studentName.add(student2);
		studentName.add(student3);
		studentName.add(student4);
		Iterator<Object> iteration = studentName.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

	@Test
	public void studentNamesNaturalOrder() {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Shabzan");
		set.add("Bhanu");
		set.add("Nikhil");
		set.add("Ragadeep");
		for (String string : set) {
			System.out.println(string);
		}
	}

	@Test
	public void favorateFruit() {
		HashMap<String, String> studentFavorateFruit = new HashMap<String, String>();

		studentFavorateFruit.put("Shabzan", new String("Banana"));
		studentFavorateFruit.put("Bhanu", new String("Orange"));
		studentFavorateFruit.put("Priyanka", new String("Grapes"));
		studentFavorateFruit.put("Hema", new String("Apple"));
		studentFavorateFruit.put("Ragadeep", new String("Mango"));

		Set set = studentFavorateFruit.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("Name is: " + mentry.getKey() + " & Favorate is: ");
			System.out.println(mentry.getValue());
		}
		System.out.println(studentFavorateFruit.get("Shabzan"));
	}
}
