package Map_2;

import java.util.HashMap;

public class wordAppend 
{
	public String wordAppend(String[] strings) 
	{
	  if(strings.length < 2) return "";
	  String ans = "";
	  HashMap<String, Integer> map = new HashMap<>();
	  for(String str : strings)
	  {
	    map.put(str, map.getOrDefault(str, 0)+1);
	    if(map.get(str)!=1 && map.get(str) % 2 == 0) ans+=str;
	  }
	  return ans;
	}

}
