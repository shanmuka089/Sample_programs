package fileHandling;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;  
public class ReadingFile{  
    public static void main(String args[]) throws IOException{    
    FileReader fr=null;
      try{
       	  fr=new FileReader("j:\\VedhaDarling.txt");  
      	  int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i); 
        	}
      catch(FileNotFoundException e)
      {
    	  fr=new FileReader("j:\\Vedha.txt");  
    	  int i;    
    	  while((i=fr.read())!=-1)    
          System.out.print((char)i);
        }
       finally {
    	   System.out.println("\nresources has been closed");
          	fr.close();
        }
   	}    
}    

