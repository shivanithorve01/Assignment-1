
public class KarateChopDescendingSortedArray
{
    
    static int chop(int target,int arr[])
    {
        int low = 0;
        int high = arr.length-1;
        
        while (low <= high) 
        {
            int mid =  low + (high - low) / 2;
            
            //To find whether array is sorted in ascending or descending order
            boolean isDescend = arr[low] > arr[high];
  
            if (arr[mid] == target)
                return mid;
  
            if(isDescend)
            {
                 if (arr[mid] < target)
                    high = mid-1;
      
                else
                    low = mid+1;
            }
            else 
            {
                if (arr[mid] > target)
                    high = mid-1;
      
                else
                    low = mid+1;
            }
        }
        return -1;
    }
    
	public static void main(String [] args) 
	{
	
	    KarateChopDescendingSortedArray obj = new KarateChopDescendingSortedArray();
        int arr[] = {8,4,2,2,1};
        int target = 2;
        int result = obj.chop(target,arr);

        System.out.println(result);
	}

}
