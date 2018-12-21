package com.cg.assignmentsIO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GrepApplicationTest {
	private GrepApplicationTest grepApplication;
	
	@Before
	public void setUp() {
		grepApplication = new GrepApplicationTest();
	}

	@Test
	public void test() {
		String absolutePath = "C:/New folder/cg.txt";
		assertEquals(54, (grepApplication.displayGivenWordLines(absolutePath));
	}

}
