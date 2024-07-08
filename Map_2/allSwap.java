package Map_2;
import java.util.HashMap;

public class allSwap {

	public String[] allSwap(String[] strings) 
	{
	  HashMap<String, Integer> map=new HashMap<>();
	  String arr[]= new String[strings.length];
	 
	  for(int i = 0 ; i < strings.length ; i++)
	  {
	    char firstChar = strings[i].charAt(0);
	    if(map.containsKey(firstChar+""))
	    {
	      int index = map.get(firstChar+"");
	      arr[i] = arr[index];
	      arr[index] = strings[i];
	      map.remove(firstChar+"");
	    }
	    else
	    {
	      arr[i]= strings[i];
	      map.put(firstChar+"",i);
	    }
	  }
	  return  arr;
	}

}
