package comm.learning.filewriterdemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String data=" added Text";
		try(FileWriter w=new FileWriter("E:\\Eclipse Projects\\"
				+ "JavaDemos-Online-Sessions\\newFile.txt",true)) {
				char dataArr[]=new char[data.length()];
				data.getChars(0, data.length(), dataArr, 0);
				w.write(dataArr);
				System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
