package com.learning.bufferedwriterdemo;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BufferedWriterDemo {

	public static void main(String[] args) {
	try (BufferedWriter writer=new BufferedWriter
			(new OutputStreamWriter(System.out))){
		String []fruitsArr= {"Apple","Mango","Banana"};
		for (int i = 0; i < fruitsArr.length; i++) {
			writer.write(fruitsArr[i]+"\n");
			writer.flush();
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	}

}
