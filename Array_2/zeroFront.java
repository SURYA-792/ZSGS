package Array_2;

public class zeroFront {

	public int[] zeroFront(int[] nums) 
	{
	  int nonZero=0;
	  for(int i = 0 ; i < nums.length ; i++)
	  {
	    if(nums[i] != 0){
	      nonZero = i;
	      break;
	    }
	  }
	  for(int i=nonZero ; i<nums.length ; i++)
	  {
	    if(nums[i] == 0)
	    {
	      nums[i]=nums[nonZero];
	      nums[nonZero++]=0;
	    }
	  }
	  return nums;
	}

}
