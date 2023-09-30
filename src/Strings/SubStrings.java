package Strings;
import java.util.Scanner;
class GFG{
	// Function to print all sub strings
	    static void subString(String s, int n) {
	        // Pick starting point
	    	char[] c=s.toCharArray();
	        for (int len = 1; len <= n; len++) {
	            // Pick ending point
	            for (int i = 0; i <= n - len; i++) {
	                //  Print characters from current
	                // starting point to current ending
	                // point. 
	                int j = i + len - 1;
	                for (int k = i; k <= j; k++) {
	                    System.out.print(c[k]);
	                }
	 
	                System.out.println();
	            }
	        }
	    }
	}
public class SubStrings {
	// Driver program to test above function
    public static void main(String[] args) {
    	Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        GFG.subString(s, s.length());
 
    }

}
