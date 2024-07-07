package Array_2;

public class zeroMax {

	public int[] zeroMax(int[] nums) 
	{
	  int maxi = 0;
	  for(int i = nums.length-1 ; i >= 0 ; i--)
	  {
	    if(nums[i] % 2 != 0)maxi = Math.max(maxi, nums[i]);
	    if(nums[i] == 0) nums[i] = maxi;
	  }
	  return nums;
	}

}
