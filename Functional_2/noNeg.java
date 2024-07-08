package Functional_2;
import java.util.*;
public class noNeg {
	
	public List<Integer> noNeg(List<Integer> nums) 
	{
	  ArrayList<Integer> list = new ArrayList<>();
	  for(Integer i : nums)
	  {
	    if(i >= 0) list.add(i);
	  }
	  return list;
	}

}
