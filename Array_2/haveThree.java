package Array_2;

public class haveThree {

	public boolean haveThree(int[] nums) 
	{
	  int count=0;
	  for(int i = 0 ; i < nums.length ; i++)
	  {
	    if(i+1<nums.length && nums[i]==3 && nums[i+1]==3) return false;
	    if(nums[i]==3) count++;
	  }
	  
	  return count == 3;
	}

}