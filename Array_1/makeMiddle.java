package Array_1;

public class makeMiddle 
{
	public int[] makeMiddle(int[] nums) 
	{
	  int n = nums.length / 2;
	  int arr[] = {nums[n-1], nums[n]};
	  return arr;
	}
}
