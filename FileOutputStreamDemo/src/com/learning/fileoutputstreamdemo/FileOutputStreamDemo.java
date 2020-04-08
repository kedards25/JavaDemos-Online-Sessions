package com.learning.fileoutputstreamdemo;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		String data="\n added data";
		byte [] buff=data.getBytes();
		//second param true indicates if the new data to be appended or should
		//overwrite the existing one
		try(FileOutputStream stream=new FileOutputStream("E:\\Eclipse Projects\\"
				+ "JavaDemos-Online-Sessions\\newFile.txt",true)) {
			for (int i = 0; i < buff.length; i++) {
				stream.write(buff[i]);
			}
			System.out.println("Writing to file done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
