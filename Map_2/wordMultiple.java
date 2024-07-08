package Map_2;

import java.util.HashMap;
import java.util.Map;

public class wordMultiple {

	public Map<String, Boolean> wordMultiple(String[] strings) 
	{
	  HashMap<String, Boolean> map = new HashMap<>();
	  for(String str : strings)
	  {
	    if(map.containsKey(str)) map.put(str, true);
	    else map.put(str, false);
	  }
	  return map;
	}

}
