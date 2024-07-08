package Recursion_2;

public class groupSum6 
{
	public boolean groupSum6(int start, int[] nums, int target) 
	{
	  if(start >= nums.length) return target == 0;  
	  
	  if(nums[start] == 6) return groupSum6(start+1, nums, target-6);
	  else
	  {
	    boolean take = groupSum6(start+1, nums, target-nums[start]);
	    boolean notTake = groupSum6(start+1, nums, target);
	    return take|| notTake;
	  }
	}

}
