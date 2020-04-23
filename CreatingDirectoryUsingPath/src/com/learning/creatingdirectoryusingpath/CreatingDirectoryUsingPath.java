package com.learning.creatingdirectoryusingpath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class CreatingDirectoryUsingPath {

	public static void main(String[] args) {
		Path target=Paths.get("E:\\Eclipse Projects\\JavaDemos-Online-Sessions\\testDir");
		
//		//Declaring Permissions on the file
//		//using PosixFilePermission which is set of permissions
//		Set<PosixFilePermission> perms=PosixFilePermissions.fromString("rw-rw-rw");
//		
//		//Setting the attributes to file which we are about to create
//		//with help of FileAttribute
//		FileAttribute<Set<PosixFilePermission>> attributes=PosixFilePermissions
//															.asFileAttribute(perms);
		
		try {
			//if I crate the file without specifying permission
			//file will be created with default permissions
			Files.createDirectory(target);
			
			//in order to create new directory/folder 
			//Files.createDirectories(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
