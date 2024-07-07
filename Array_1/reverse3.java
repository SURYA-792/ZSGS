package Array_1;

public class reverse3 
{
	public int[] reverse3(int[] nums) 
	{
	  int l = 0, r = nums.length-1;
	  while(l < r)
	  {
	    int temp = nums[l];
	    nums[l]=nums[r];
	    nums[r]=temp;
	    l++;
	    r--;
	  }
	  return nums;
	}
}
