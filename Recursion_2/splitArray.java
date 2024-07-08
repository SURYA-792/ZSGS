package Recursion_2;

public class splitArray 
{
	public boolean splitArray(int[] nums) 
	{
	  int sum = 0;  
	  for(int i=0;i<nums.length;i++) sum+=nums[i];
	  if(sum %2 != 0) return false;
	  return helper(nums, 0, sum / 2);
	  
	}
	public boolean helper(int nums[], int index, int target)
	{
	  if(index >= nums.length) return target == 0;
	  
	  boolean take = helper(nums, index+1, target-nums[index]);
	  boolean notTake = helper(nums, index+1, target);
	  
	  return take || notTake;
	}
}
