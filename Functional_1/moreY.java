package Functional_1;
import java.util.*;
public class moreY {

	public List<String> moreY(List<String> strings) 
	{
	  ArrayList<String> list = new ArrayList<>();
	  for(String str : strings)
	  {
	    list.add("y"+str+"y");
	  }
	  return list;
	}

}
