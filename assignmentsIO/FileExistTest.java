package com.cg.assignmentsIO;
	/**
	 * accept the complete path of a file and checking whether the file exist or not.
	 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class FileExistTest {

	private FileExist file;
	
	@Before
	public void setUp() {
		file = new FileExist();
	}
	/**
	 * Test case for checking the file existing or not.
	 */
	@Test
	public void fileExistOrNotTest() {
		String absolutePath="C://javascript/Day1/HelloWorld.js";
		assertTrue(file.fileExists(absolutePath));
	}

}
