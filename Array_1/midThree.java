package Array_1;

public class midThree 
{
	public int[] midThree(int[] nums) 
	{
	  int n = nums.length / 2;  
	  int arr[] = new int[3];
	  arr[0] = nums[n-1];
	  arr[1] = nums[n];
	  arr[2] = nums[n+1];
	  return arr;
	}

}
