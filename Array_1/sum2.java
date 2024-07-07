package Array_1;

public class sum2 
{
	public int sum2(int[] nums) 
	{
	  int sum = 0, n = nums.length;
	  if(n > 0) sum += nums[0];
	  if(n > 1) sum += nums[1];
	  return sum;
	}

}
