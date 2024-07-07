package Array_3;

public class countClumps 
{
	public int countClumps(int[] nums) 
	{
	  int clumps = 0, count = 1;
	  for(int i = 0 ; i < nums.length-1 ; i++)
	  {
	    if(nums[i] == nums[i+1]) count++;
	    else {
	      if(count >= 2) clumps++;
	      count=1;
	    }
	  }
	  if(count>=2) clumps++;
	  return clumps;
	}

}
