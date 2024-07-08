package Functional_1;
import java.util.*;
public class copies3 {
	public List<String> copies3(List<String> strings) 
	{
	    ArrayList<String> list = new ArrayList<>();
	    for(String str : strings)
	    {
	      list.add(str+str+str);
	    }
	    return list;
	}

}
