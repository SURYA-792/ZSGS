package Map_1;

import java.util.Map;

public class mapShare {

	public Map<String, String> mapShare(Map<String, String> map) 
	{
	  if(map.containsKey("c")) map.remove("c");  
	  
	  if( map.containsKey("a") && map.get("a").length() > 0)
		{
		      map.put("b", map.get("a"));
		}  
		return map;
	}

}
