package Functional_1;
import java.util.*;
public class noX {

	public List<String> noX(List<String> strings) 
	{
	  ArrayList<String> list = new ArrayList<>();
	  for(String str : strings)
	  {
	    String withoutX = "";
	    for(int i = 0 ; i < str.length() ; i++) 
	      if(str.charAt(i) != 'x')withoutX += str.charAt(i);
	    list.add(withoutX);  
	  }
	  return list;
	}

}
