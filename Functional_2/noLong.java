package Functional_2;
import java.util.*;
public class noLong {

	public List<String> noLong(List<String> strings) 
	{
	  strings.removeIf(str -> str.length()>=4);
	  return strings;
	}

}
