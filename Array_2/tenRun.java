package Array_2;

public class tenRun {

	public int[] tenRun(int[] nums) 
	{
	  int tens = -1;
	  for(int i = 0 ; i < nums.length ; i++)
	  {
	    if(nums[i] % 10 == 0) tens=nums[i];
	    if(tens!=-1) nums[i]=tens;
	  }
	  return nums;
	}

}
