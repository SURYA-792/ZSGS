package Array_1;

public class unlucky1 
{
	public boolean unlucky1(int[] nums) 
	{
	  int n = nums.length;  
	  if(n < 2) return false;
	  if(nums[0] == 1 && nums[1] == 3) return true;
	  if(n > 2 && nums[1]==1 && nums[2]==3) return true;  
	  if(nums[n-2]==1 && nums[n-1]==3) return true;
	  return false;
	}

}
