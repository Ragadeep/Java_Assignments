package com.cg.assignmentsIO;

import java.io.File;
	/**
	 * 
	 * @author ragadeep
	 *	Check the file existing or not by giving the file path. 
	 */
public class FileExist {
	/**
	 * 
	 * @param absolutePath
	 * @return
	 * condition for checking the file exists and then return true if exists.
	 */
	public boolean fileExists(String absolutePath) 
	{
		File filepath = new File(absolutePath);
		if(filepath.exists())
			return true;
		return false;
	}
}
