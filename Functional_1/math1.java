package Functional_1;
import java.util.*;
public class math1 {

	public List<Integer> math1(List<Integer> nums) 
	{
	  ArrayList<Integer> list = new ArrayList<>();
	  for(Integer i : nums)
	  {
	    list.add((i+1)*10);
	  }
	  return list;
	}

}
