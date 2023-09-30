package fileHandling;

import java.io.File;

public class FileInformationGetting {

	public static void main(String[] args) {
		File f=new File("j:\\Vedha.txt");
		if(f.exists()) {
			System.out.println("get name of the file:\t"+f.getName());
			System.out.println("get the path of the file:\t"+f.getAbsolutePath());
			System.out.println("get the length of the file:\t"+f.length());
			System.out.println("can we read the file:\t"+f.canRead());
			System.out.println("can we write the file:\t"+f.canWrite());
		}
		else {
			System.out.println("file does not exist");
		}
	}

}
