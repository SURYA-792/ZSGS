package Array_3;

public class canBalance 
{
	public boolean canBalance(int[] nums) 
	{
	  int firstSum=0;
	  for(int i=0;i<nums.length;i++)
	  {
	     firstSum += nums[i];
	    int secondSum=0;
	    for(int j =i+1;j<nums.length;j++)
	    {
	      secondSum+=nums[j];
	    }
	    if(firstSum==secondSum) return true;
	  }  
	  return false;
	}

}
