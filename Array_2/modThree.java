package Array_2;

public class modThree {

	public boolean modThree(int[] nums) 
	{
	  for(int i=0;i < nums.length;i++)
	  {
	    int even = 0, odd = 0;
	    if(i+2 < nums.length)
	    {
	      if(nums[i] % 2 == 0) even++;
	      else odd++;
	      if(nums[i+1] % 2 == 0) even++;
	      else odd++;
	      if(nums[i+2] % 2 == 0) even++;
	      else odd++;
	    }
	    if(even==3 || odd==3) return true;
	  }
	  return false;
	}

}
