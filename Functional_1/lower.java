package Functional_1;
import java.util.*;
public class lower {

	public List<String> lower(List<String> strings) 
	{
	   ArrayList<String> list = new ArrayList<>();  
		 for(String str : strings)
		  {
			    list.add(str.toLowerCase());
			}
			return list;  
	}

}
