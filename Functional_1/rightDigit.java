package Functional_1;
import java.util.*;
public class rightDigit {

	public List<Integer> rightDigit(List<Integer> nums) 
	{
	  ArrayList<Integer> list = new ArrayList<>();  
	  for(Integer i : nums)
		  {
		    list.add(i % 10);
		  }
		  return list;
	}

}
