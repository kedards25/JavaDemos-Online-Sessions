package com.learning.pathdemo;

import java.nio.file.*;

public class PathDemo {

	public static void main(String[] args) {
		
			//Path is an interface and Paths is a class
			Path filePath=Paths.get("E:\\Eclipse Projects\\JavaDemos-Online-Sessions\\sampleFile.txt");
			Path filePath2=Paths.get("E:\\Eclipse Projects\\JavaDemos-Online-Sessions\\newFile.txt");
			//System.out.println(filePath.getFileName());
			
			//The OS name
			//System.out.println(filePath.getFileSystem());
			
			//NameCount gives no of parts forming the path where root directory is considered to be 0
			//System.out.println(filePath.getNameCount());
			
			//part of path at particular index
			//System.out.println(filePath.getName(2));
			
			//Physical path till the file
			//System.out.println(filePath.getParent());
			
			//Root Directory
			//System.out.println(filePath.getRoot());
			
			//System.out.println(filePath.isAbsolute());
			
			//Comparing two paths 
			System.out.println(filePath.compareTo(filePath2));
	}

}
