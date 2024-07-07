package Array_1;

public class frontPiece 
{
	public int[] frontPiece(int[] nums) 
	{
	  int n = nums.length >= 2 ? 2 : nums.length;
	  int arr[]=new int[n];
	  for(int i = 0 ; i < n ; i++)
	  {
	    arr[i]=nums[i];
	  }
	  return arr;
	}

}
