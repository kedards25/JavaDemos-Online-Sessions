package com.learning.bufferedoutputstreamdemo;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedOutputStream outStream=new BufferedOutputStream(System.out)) {
			String data="This is sample Data";
			byte[] buff=data.getBytes();
			outStream.write(buff);
			outStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
	}

}
