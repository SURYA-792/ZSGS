package Array_1;

import java.util.Arrays;

public class maxEnd3 
{
	public int[] maxEnd3(int[] nums) 
	{
	  int maxi = Math.max(nums[0], nums[nums.length-1]);
	  Arrays.fill(nums, maxi);
	  return nums;
	}

}
