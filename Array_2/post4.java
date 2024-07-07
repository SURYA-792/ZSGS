package Array_2;

public class post4 {

	public int[] post4(int[] nums) 
	{
	  int lastFour = 0;
	  for(int i = 0 ; i < nums.length ; i++) if(nums[i] == 4) lastFour=i;
	  
	  int arr[] = new int[nums.length - lastFour - 1];
	  lastFour++;
	  for(int i = 0 ; i < arr.length ; i++)
	  {
	    arr[i] = nums[lastFour++];
	  }
	  return arr;
	}

}
