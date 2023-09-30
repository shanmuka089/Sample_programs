package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamInPut {

	public static void main(String[] args) {
		FileInputStream fi=null;
		try {
			fi=new FileInputStream("j:\\Shanu.txt");
			int i;
			while((i=fi.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
