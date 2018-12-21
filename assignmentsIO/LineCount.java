package com.cg.assignmentsIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
	/**
	 * 
	 * @author ragadeep	
	 *accept the complete path of a file and count the number of lines in that file and get line count.
	 */
public class LineCount {
	/**
	 * 
	 * @param absolutePath
	 * @return
	 * @throws IOException
	 * getting the path of the file and incrementing the line count and return the count. Throw exception if the path not found.
	 */
	public int fileLineCount(String absolutePath) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(absolutePath));
		int lines = 0;
		while (reader.readLine() != null) 
			lines++;
		reader.close();
		return lines;
	}
}
