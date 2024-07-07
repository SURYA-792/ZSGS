package Array_2;

public class withoutTen {

	public int[] withoutTen(int[] nums) 
	{
	  int nonTen=0;
	  for(int i = 0 ; i < nums.length ; i++)
	  {
	   if(nums[i]!=10) nums[nonTen++]=nums[i];
	  } 
	  
	  for(int i = nonTen ; i < nums.length ; i++) nums[i]=0;
	  return nums;
	}

}
