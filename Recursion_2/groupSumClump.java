package Recursion_2;

public class groupSumClump {

	public boolean groupSumClump(int start, int[] nums, int target) 
	{
	  if(start >= nums.length) return target == 0;
	  
	  int i, sum=0;
	  for(i = start ; i < nums.length && nums[start]==nums[i] ; i++) sum += nums[i];
	  
	  boolean allTake = groupSumClump(i, nums, target-sum);
	  boolean notTake =  groupSumClump(i, nums, target); 
	  return allTake || notTake;
	}

}
