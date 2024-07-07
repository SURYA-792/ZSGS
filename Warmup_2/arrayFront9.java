package Warmup_2;

public class arrayFront9 
{
	public boolean arrayFront9(int[] nums) 
	{
		  int n = nums.length;
		  if(n >= 4) n = 4;
		  for(int i = 0; i < n ; i++) if(nums[i]==9) return true;
		  
		  return false;
	}

}
