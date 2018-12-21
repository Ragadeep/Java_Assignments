package com.cg.assignmentsIO;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class LineCountTest {
	private LineCount lineCount;
	
	@Before
	public void setUp() {
		lineCount = new LineCount();
	}
	/**
	 * Test case for getting line count and equating with expected value using assert.
	 */
	@Test
	public void fileWordCound() {
		String absolutePath="C:/Java_Assignments/Day1/hello.java";
		try {
			assertEquals(17, lineCount.fileLineCount(absolutePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
