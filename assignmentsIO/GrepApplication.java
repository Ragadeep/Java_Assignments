package com.cg.assignmentsIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GrepApplication {
	public String displayGivenWordLines(String absolutePath) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(absolutePath));
		String currentLine = "";
		int line = 0;
		while( (currentLine = reader.readLine()) != null ) {
			line++;
			Systen.out.println(line);
//			String[] words = currentLine.split(" ");
//			for (int i = 0; i < words.length; i++) {
//				if( words[i].equals("capgemini")) {
//					System.out.print(currentLine);
//				}
//				else {
//					System.out.println("");
//				}
//			}
		}
		return line;
	}
}
