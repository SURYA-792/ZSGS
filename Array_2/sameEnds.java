package Array_2;

public class sameEnds {

	public boolean sameEnds(int[] nums, int len) 
	{
	  int n = nums.length;
	  if(n == len || n <= 1) return true;
	  for(int i = 0 ; i < len ; i++)
	  {
	    if(nums[i] != nums[n+i-len]) return false;
	  }
	  return true;
	}

}
