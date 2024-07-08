package Map_2;

import java.util.HashMap;
import java.util.Map;

public class wordLen {

	public Map<String, Integer> wordLen(String[] strings) 
	{
	  HashMap<String, Integer> map = new HashMap<>();
	  for(String str : strings)
	  {
	    map.put(str, str.length());
	  }
	  return map;
	}

}
