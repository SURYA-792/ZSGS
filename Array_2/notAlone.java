package Array_2;

public class notAlone {

	public int[] notAlone(int[] nums, int val) 
	{
	  for(int i = 1 ; i < nums.length-1 ; i++)
	  {
	    if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]) {
	      nums[i]=Math.max(nums[i-1], Math.max(nums[i+1], nums[i] ));
	    }
	  }
	  return nums;
	}

}
