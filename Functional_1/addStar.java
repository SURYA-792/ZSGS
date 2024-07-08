package Functional_1;
import java.util.*;
public class addStar {

	public List<String> addStar(List<String> strings) 
	{
	  ArrayList<String> list = new ArrayList<>();
	  for(String str : strings)
	  {
	    list.add(str+"*");
	  }
	  return list;
	}

}
