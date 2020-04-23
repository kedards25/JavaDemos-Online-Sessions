package comm.learning.deletefile_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFileDemo_NIO {

	public static void main(String[] args) {
		Path destinationPath=Paths.get("E:\\Eclipse Projects\\JavaDemos-Online-Sessions\\testDir\\sampleFile.txt");
		try {
			//System.out.println(Files.deleteIfExists(destinationPath));
			Files.delete(destinationPath);
		} 
		catch (NoSuchFileException e) {
			// TODO: handle exception
			System.out.println("NoSuchFileException: "+e);
		}
		catch (SecurityException e) {
			// TODO Auto-generated catch block
			System.out.println("SecurityException: "+e);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("I/O exception: "+e);
		}
	}

}
