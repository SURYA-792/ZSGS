package Recursion_2;

public class splitOdd10 
{
	public boolean splitOdd10(int[] nums) 
	{
	  return helper(0, nums, 0, 0);
	}
	public boolean helper(int index, int nums[], int group1, int group2)
	{
	  if(index >= nums.length) return group1 % 10 == 0 && group2 % 2 == 1;

	  boolean g1 = helper(index+1, nums, group1+nums[index], group2);
	  boolean g2 = helper(index+1, nums, group1, group2+nums[index]);
	  
	  return g1 || g2;
	}

}
