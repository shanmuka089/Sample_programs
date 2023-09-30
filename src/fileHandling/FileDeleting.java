package fileHandling;

import java.io.File;

public class FileDeleting {

	public static void main(String[] args) {
		File f=new File("j:\\Vedha.txt");
		if(f.exists()) {
			if(f.delete()){
			System.out.println("file is deleted successfully");
			}
			else {
				System.out.println("unexpected error occured while deleting");
			}
		}else {
			System.out.println("file not found");
		}
		
	}

}
