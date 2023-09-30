package arrays;
import java.util.Arrays;
public class ChangeTheValueInArray
{
		  public static void main(String[] args)
		  {
		    int arr[] = {1,2,3,4};
		    System.out.println("Before update; "+Arrays.toString(arr));
		    arr[2] = 9;//updating the value
		    System.out.println("After update "+Arrays.toString(arr));
		  }
}
