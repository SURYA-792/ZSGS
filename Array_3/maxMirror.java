package Array_3;

public class maxMirror 
{
	public int maxMirror(int[] nums) 
	{
	  int maxi=0;
	   int count = 0;
	  for(int i = 0 ; i < nums.length ; i++)
	  {
	    count=0;
	    for(int j = nums.length-1 ; j >= 0 && i + count < nums.length ; j--)
	    {
	      if(nums[i+count]==nums[j]) count++;
	      else{
	        maxi = Math.max(maxi, count);
	        count=0;
	      }
	    }
	    maxi = Math.max(count, maxi);
	  }
	  return maxi;
	}

}
