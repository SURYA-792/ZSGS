package Array_3;

public class fix45 
{
	public int[] fix45(int[] nums) {
		  int four = 0;
		  int five=0;
		  
		  while(five < nums.length && nums[five]!=5) five++;
		  
		  while(four < nums.length)
		  {
		    if(nums[four] == 4){
		      int temp = nums[four+1];
		      nums[four+1]=nums[five];
		      nums[five]=temp;
		      while(five < nums.length && nums[five]!=5 || five==four+1) five++;
		    }
		    four++;
		  }
		  return nums;
		}
}
