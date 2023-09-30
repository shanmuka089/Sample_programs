package fileHandling;
import java.io.*;

class Emp implements Serializable {
	
//	static & transient variables not serialized & not deserialized
//	after deserialization transient variables are set to default values
    transient int a;
    static int b;
    String name;
    int age;
  
    // Default constructor
    public Emp(String name, int age, int a, int b)
    {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }
  
}
  
public class SerialExample {
	public static void printdata(Emp object1)
    {
	  
        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }
  
	public static void main(String[] args)
    {
		String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(LongestSubstring.lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println(LongestSubstring.lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println(LongestSubstring.lengthOfLongestSubstring(s3)); // Output: 3

		
        Emp object = new Emp("ab", 20, 2, 1000);
        String filename = "shubham.txt";
  
        // Serialization
        try {
  
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                                           (filename);
            ObjectOutputStream out = new ObjectOutputStream
                                           (file);
  
            // Method for serialization of object
            out.writeObject(object);
  
            out.close();
            file.close();
  
            System.out.println("Object has been serialized\n"
                              + "Data before Deserialization.");
            printdata(object);
  
            // value of static variable changed not serialized
            Emp.b = 2000;
        }
  
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
  
        object = null;
  
        // Deserialization
        try {
        	
//        	value of b will be class specific not serialized & desirialized
        	System.out.println("<--------------- "+Emp.b+" ----------------->");
  
            // Reading the object from a file
            FileInputStream file = new FileInputStream
                                         (filename);
            ObjectInputStream in = new ObjectInputStream
                                         (file);
  
            // Method for deserialization of object
            object = (Emp)in.readObject();
  
            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                                + "Data after Deserialization.");
            printdata(object);
  
            // System.out.println("z = " + object1.z);
        }
  
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
  
        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                                " is caught");
        }
    }
}

class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] index = new int[128]; // Assuming ASCII characters
        
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            maxLength = Math.max(maxLength, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        
        return maxLength;
    }
}
