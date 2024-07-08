package Functional_2;
import java.util.*;
public class noYY {

	public List<String> noYY(List<String> strings) 
	{
	  for(int i = 0 ; i < strings.size() ; i++) strings.set(i, strings.get(i)+"y");
	  strings.removeIf(str -> str.contains("yy"));
	  return strings;
	}

}
