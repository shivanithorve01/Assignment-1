
public class KarateChopIterative
{
    
    static int chop(int target,int arr[])
    {
        int low = 0;
        int high = arr.length-1;
        
        while (low <= high) 
        {
            int mid =  low + (high - low) / 2;
  
            // If the search target is present at the mid itself
            if (arr[mid] == target)
                return mid;
  
            // If search target is smaller than mid, then
            // it can only be present in left subarray
            else if (arr[mid] > target)
                high = mid-1;
  
            // If search target is larger than mid, then
            // target is in right subarray
            else
                low = mid+1;
        }
        // If search key is not present in an array
        return -1;
    }
    
	public static void main(String [] args) 
	{
	
	    KarateChopIterative obj = new KarateChopIterative();
        int arr[] = {0,1,2,5,8};
        int target = 2;
        int result = obj.chop(target,arr);

        System.out.println(target+" is present at index "+result);
	}

}
