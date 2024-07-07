package Array_3;

public class fix34 
{
	public int[] fix34(int[] nums) 
	{
	  int three = 0;
	  int four = 0;
	  while(four < nums.length && nums[four]!=4) four++;
	  
	  while(three < nums.length)
	  {
	    if(nums[three] == 3){
	      int temp = nums[three+1];
	      nums[three+1]=nums[four];
	      nums[four]=temp;
	      while(four < nums.length && nums[four]!=4) four++;
	    }
	    three++;
	  }
	  return nums;
	}


}
