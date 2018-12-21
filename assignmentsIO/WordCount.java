package com.cg.assignmentsIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	public int fileWordCount(String absolutePath) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(absolutePath));
		String currentLine = "";
		int wordCount = 0;
		while( ( currentLine = reader.readLine()) != null ) {
			String[] words = currentLine.split(" ");
			wordCount = wordCount + words.length;
		}
		return wordCount;
	}
}
