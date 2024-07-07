package Recursion_1;

public class array220 {

	public boolean array220(int[] nums, int index) 
	{
	  if(nums.length==0 || nums.length-1 <= index) return false;
	  
	  if((nums[index]*10) == nums[index+1]) return true;
	  return array220(nums, index+1);
	}

}
