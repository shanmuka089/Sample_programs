package fileHandling;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamOut {

	public static void main(String[] args) {
		FileOutputStream fo=null;
		String s="love you priyanka darling";
		try {
			 fo=new FileOutputStream("j:\\Shanu.txt");
			 byte[] b=s.getBytes();
			 fo.write(b);
			 System.out.println("successfully created");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
