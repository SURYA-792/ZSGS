package Array_2;

import java.util.Arrays;

public class centeredAverage {

	public int centeredAverage(int[] nums) 
	{
	  Arrays.sort(nums);
	  int sum = 0, count = 0;
	  for(int i = 1 ; i < nums.length-1; i++)
	  {
	    sum+=nums[i];
	    count++;
	  }
	  return sum/count;
	} 

}
