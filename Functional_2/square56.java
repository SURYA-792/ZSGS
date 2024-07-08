package Functional_2;
import java.util.*;
public class square56 {

	public List<Integer> square56(List<Integer> nums) 
	{
	  for(int i=0;i<nums.size();i++) nums.set(i, nums.get(i)*nums.get(i)+10 );
	  
	  nums.removeIf(num -> num % 10 == 5 || num % 10 == 6); 
	  return nums;
	}

}
