package Map_2;

import java.util.HashMap;
import java.util.Map;

public class pairs 
{
	public Map<String, String> pairs(String[] strings) 
	{
	  HashMap<String, String> map = new HashMap<>();
	  for(String str : strings)
	  {
	    map.put(str.charAt(0)+"", str.charAt(str.length()-1)+"");
	  }
	  return map;
	}

}
