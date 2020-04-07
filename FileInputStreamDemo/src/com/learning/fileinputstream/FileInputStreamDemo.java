package com.learning.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
//		double backslash indicates java to ignore it as escape character
//		and consider it as path separator
		int i;
		char c;
		try (FileInputStream inputStream=new FileInputStream("E:\\Eclipse Projects\\"
				+ "JavaDemos-Online-Sessions\\sampleFile.txt");)
		{
			
			while ((i=inputStream.read())!=-1) {
		
				c=(char)i;
				System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found "+e.getMessage());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("I/O Error "+e1.getMessage());
		} 

	}

}
