package colm.learning.movefilenio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveFileNIO {

	public static void main(String[] args) {
		Path sourcePath=Paths.get("E:\\Eclipse Projects\\JavaDemos-Online-Sessions\\sampleFile.txt");
		Path destinationPath=Paths.get("E:\\Eclipse Projects\\JavaDemos-Online-Sessions\\testDir\\sampleFile.txt");
		try {
			Files.move(sourcePath, destinationPath);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
