package Functional_1;
import java.util.*;
public class doubling {

	public List<Integer> doubling(List<Integer> nums) 
	{
	  ArrayList<Integer> list = new ArrayList<>();
	  
	  for(Integer i : nums){
	    list.add(i*2);  
	  }
	  return list;
	}

}
