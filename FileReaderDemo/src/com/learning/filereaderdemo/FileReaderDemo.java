package com.learning.filereaderdemo;

import java.io.*;
import java.util.Iterator;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader reader=new FileReader("E:\\Eclipse Projects\\JavaDemos-Online-Sessions\\sampleFile.txt")) {
			char []readData=new char[50];
			reader.read(readData);
			for(char data:readData)
			{
				System.out.print(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found "+e.getMessage());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("I/O exception "+e1.getMessage());
		}
	}

}
