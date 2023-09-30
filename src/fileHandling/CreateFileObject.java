package fileHandling;
import java.io.File;
public class CreateFileObject {

	public static void main(String[] args) {
		File fr=new File("j:\\Vedha.txt");
		try {
			if(fr.createNewFile())
				System.out.println("file created");
			else
				System.out.println("file already exist");
		}catch(Exception e){
			System.out.println("an error occured");
			e.printStackTrace();
		}
	}

}
