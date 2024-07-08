package Recursion_2;

public class groupNoAdj 
{
	public boolean groupNoAdj(int start, int[] nums, int target) 
	{
	  if(start >= nums.length) return target == 0;
	  
	  boolean take = groupNoAdj(start+2, nums, target-nums[start]);
	  boolean notTake = groupNoAdj(start+1, nums, target);
	  
	  return take || notTake;
	}

}
