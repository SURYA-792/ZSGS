package Array_2;

public class pre4 {

	public int[] pre4(int[] nums) 
	{
	  int firstFour=-1;
	  for(int i = 0 ; i < nums.length ; i++)
	  {
	    if(nums[i] == 4){
	      firstFour=i;
	      break;
	    }
	  }
	  int arr[] = new int[firstFour];
	  for(int i=0 ; i < firstFour ; i++)
	  {
	    arr[i]=nums[i];
	  }
	  return arr;
	}

}
