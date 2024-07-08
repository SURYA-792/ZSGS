package Functional_2;
import java.util.*;
public class two2 {

	public List<Integer> two2(List<Integer> nums) 
	{
	  for(int i = 0 ; i < nums.size() ; i++) nums.set(i, nums.get(i)*2);
	  
	  nums.removeIf(num -> num % 10 == 2);
	  return nums;
	}

}
