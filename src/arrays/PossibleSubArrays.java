package arrays;
class Test
{ 
    // Prints all subarrays in arr[0..n-1]
    static void subArray(int[] arr,int n)
    {
        // Pick starting point
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                // Print subarray between current starting
                // and ending points
                for (int k=i; k<=j; k++)
                    System.out.print(arr[k]+" ");
                System.out.println();
            }
        }
    }
}
public class PossibleSubArrays {
	// Driver method to test the above function
	static int arr[] = new int[]{1, 2, 3, 4};
    public static void main(String[] args)
    {
        System.out.println("All Non-empty Subarrays");
        Test.subArray(arr,arr.length);
         
    }
}
