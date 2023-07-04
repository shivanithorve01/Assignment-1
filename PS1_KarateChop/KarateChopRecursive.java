import java.io.*;

public class KarateChopRecursive
{
    
    static int chop(int target,int arr[])
    {
        return karateChopRecursive(0,arr.length-1,target,arr);
    }
    
    //Auxillary Function
    static int karateChopRecursive(int low, int high, int target,int arr[])
    {
        if (low <= high) 
        {
            int mid =  low + (high - low) / 2;
  
            // If the search target is present at the mid itself
            if (arr[mid] == target)
                return mid;
  
            // If search target is smaller than mid, then
            // it can only be present in left subarray
            else if (arr[mid] > target)
                return karateChopRecursive(0,mid-1,target,arr);
  
            // If search target is larger than mid, then
            // target is in right subarray
            else
                return karateChopRecursive(mid+1,high,target,arr);
        }
        
        // If search key is not present in an array
        return -1;
    }
    
    //Driver Code 
	public static void main(String [] args) 
	{
	
	    KarateChopRecursive obj = new KarateChopRecursive();
        int arr[] = {1,3,5,7};
        int target = 7;
        int result = obj.chop(target,arr);

        System.out.println(target+" is present at index "+result);
	}
}
