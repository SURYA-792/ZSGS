package Map_2;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
	public Map<String, Integer> wordCount(String[] strings) 
	{
	  HashMap<String, Integer> map = new HashMap<>();
	  for(String str : strings)
	  {
	    map.put(str, map.getOrDefault(str,0)+1);
	  }
	  return map;
	}

}
