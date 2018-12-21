package com.cg.assignmentsIO;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest {
	private WordCount wordCount;
	
	@Before
	public void setUp() {
		wordCount = new WordCount();
	}

	@Test
	public void test() {
		String absolutePath="C:/Users/rapola/Downloads/Day-3-Java-Classes and Objects/Date Assignment - Classes and Objects.txt";
		try {
			assertEquals(201 , wordCount.fileWordCount(absolutePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
