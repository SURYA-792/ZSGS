package Map_2;

import java.util.HashMap;
import java.util.Map;

public class word0 {

	public Map<String, Integer> word0(String[] strings) 
	{
	  HashMap<String, Integer> map = new HashMap<>();
	  for(String str : strings)
	  {
	    map.put(str, 0);
	  }
	  return map;
	}

}
