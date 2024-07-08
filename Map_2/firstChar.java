package Map_2;

import java.util.HashMap;
import java.util.Map;

public class firstChar {

	public Map<String, String> firstChar(String[] strings) 
	{
	  HashMap<String ,String> map = new HashMap<>();
	  for(String str : strings)
	  {
	    char firstChar = str.charAt(0);
	    if(map.containsKey(firstChar + "")) map.put(firstChar + "", map.get(firstChar+"")+str);
	    else map.put(firstChar+"", str);
	  }
	  return map;
	}

}
