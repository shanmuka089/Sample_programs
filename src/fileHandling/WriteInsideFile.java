package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInsideFile {

	public static void main(String[] args){
		File f=new File("j:\\Vedha.txt");
		FileWriter fw=null;
		try {
			if(f.exists()) {
				fw=new FileWriter("j:\\Vedha.txt");
				fw.write("Love You Vedha Darling\n");
				fw.write("love you baby");
				System.out.println("data is written in  the file");
			}
			else {
				f.createNewFile();
			}
		}catch(Exception e) {
			System.out.println("an error occured");
		}finally {
					try {
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
		}
		 
	}

}
