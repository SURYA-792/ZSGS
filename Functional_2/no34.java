package Functional_2;
import java.util.*;
public class no34 {
	
	public List<String> no34(List<String> strings) 
	{
	  strings.removeIf(str -> str.length()==3 || str.length()==4);
	  return strings;
	}

}
