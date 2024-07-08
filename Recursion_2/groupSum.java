package Recursion_2;

public class groupSum 
{
	public boolean groupSum(int start, int[] nums, int target) 
	{
	if(nums.length < 1 ) return true;
	 if(target == 0) return true;
	 if(start == nums.length) return nums[nums.length-1]==target;
	 
	    boolean nonTake = groupSum(start + 1, nums, target);
	    boolean take = groupSum(start + 1, nums, target-nums[start]);
	    
	    return take || nonTake;
	}

}
