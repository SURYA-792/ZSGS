package Array_2;

public class evenOdd {

	public int[] evenOdd(int[] nums) 
	{
	  int j = 0;
	  int arr[]=new int[nums.length];
	  for(int i = 0 ; i < nums.length ; i++){
	    if(nums[i] % 2 == 0) arr[j++] = nums[i];
	  }
	  for(int i=0 ; i < nums.length ; i++)
	  {
	   if(nums[i] % 2 != 0) arr[j++] = nums[i];
	  }
	  return arr;
	}

}
