package com.learning.existsdemo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExistsDemo {

	public static void main(String[] args) {
		Path sourcePath=Paths.get("E:\\Eclipse Projects\\JavaDemos-Online-Sessions\\sampleFile.txt");
		//Path sourcePath=Paths.get("E:\\Eclipse Projects\\JavaDemos-Online-Sessions\\testDir\\sampleFile.txt");
		boolean pathExists=Files.exists(sourcePath);
		if (pathExists) {
			System.out.println("given File Path exists");
		}
		else {
			System.out.println("invalid path");
		}
		
	}
}
