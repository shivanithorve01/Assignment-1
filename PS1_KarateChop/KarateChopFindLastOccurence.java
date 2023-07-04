public class KarateChopFindLastOccurence
{
    
    static int chop(int target,int arr[])
    {
        int low = 0;
        int high = arr.length-1;
        int result = -1;
        
        while (low <= high) 
        {
            int mid =  low + (high - low) / 2;
  
            if (arr[mid] == target)
            {
                result = mid;
                low = mid+1;
            }

            else if (arr[mid] > target)
                high = mid-1;
  
            else
                low = mid+1;
        }
        return result;
    }
    
	public static void main(String [] args) 
	{
	
	    KarateChopFindLastOccurence obj = new KarateChopFindLastOccurence();
        int arr[] = {0,1,2,2,5,5,5,8};
        int target = 5;
        int result = obj.chop(target,arr);

        System.out.println("Last Occurence of "+target+" is at "+result);
	}

}
