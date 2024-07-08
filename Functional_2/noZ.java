package Functional_2;
import java.util.*;
public class noZ {

	public List<String> noZ(List<String> strings) 
	{
	  strings.removeIf(str -> str.contains("z"));
	  return strings;
	}
}
