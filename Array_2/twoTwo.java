package Array_2;

public class twoTwo {

	public boolean twoTwo(int[] nums) 
	{
	  int n = nums.length;
	  if(n < 2) 
	  {
	    return n==0 || nums[0]!=2;
	  }
	  for(int i = 0 ; i < nums.length-1 ; i++)
	  {
	    if(i==0 && nums[i]==2 && nums[i+1]!=2) return false;
	    if( (nums[i]==2 && (nums[i+1]!=2) && (nums[i]==2 && nums[i-1]!=2) )) return false;
	  }
	  if(nums[n-1]==2 && nums[n-2]!=2) return false;
	  return true;
	}
}
