package Array_3;

public class maxSpan 
{
	public int maxSpan(int[] nums) 
	{
	  if(nums.length == 0)return 0;
	  int maxi = 1;  
	  for(int i = 0 ; i < nums.length ; i++)
	  {
	    int span=1;
	    for(int j = i+1 ; j < nums.length ; j++)
	    {
	      if(nums[i]==nums[j]) 
	      {
	        span=j-i+1;
	        maxi = Math.max(span, maxi);
	      }
	    }
	  }
	  return maxi;
	}
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
