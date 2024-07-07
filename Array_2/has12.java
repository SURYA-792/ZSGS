package Array_2;

public class has12 {

	public boolean has12(int[] nums) 
	{
	  for(int i=0;i<nums.length;i++)
	  {
	    if(nums[i]==1) 
	    {
	      while(i < nums.length) 
	      {
	        if(nums[i]==2) return true;
	        else i++;
	      }
	    }
	  }
	  return false;
	}

}
