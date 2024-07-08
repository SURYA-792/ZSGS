package Functional_1;
import java.util.*;
public class square {

	public List<Integer> square(List<Integer> nums) 
	{
	  ArrayList<Integer> list = new ArrayList<>();
	  for(Integer i : nums)
	  {
	    list.add(i*i);
	  }
	  return list;
	}

}
