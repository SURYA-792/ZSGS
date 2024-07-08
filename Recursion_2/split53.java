package Recursion_2;

public class split53 
{
	public boolean split53(int[] nums) 
	{
	  return helper(nums, 0, 0, 0);  
	}

	public boolean helper(int nums[], int index, int fives, int threes)
	{
	  if(index >= nums.length) return fives == threes;
	    
	  if(nums[index] % 3 == 0) return helper(nums, index+1, fives, threes + nums[index]);
	  if(nums[index] % 5 == 0) return helper(nums, index+1, fives + nums[index], threes);
	  
	  boolean five = helper(nums, index+1, fives + nums[index], threes);
	  boolean three = helper(nums, index+1, fives, threes + nums[index]);
	  return five || three;
	}
}
