package Array_1;

public class maxTriple 
{
	public int maxTriple(int[] nums) 
	{
	  int n = nums.length;
	  if (n==1) return nums[0];
	  int first = nums[0], mid = nums[n/2], last = nums[n-1];
	  return first < mid ? (mid < last ? last : mid) : (first < last ? last : first);
	}

}
