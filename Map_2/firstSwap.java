package Map_2;
import java.util.ArrayList;
import java.util.HashMap;

public class firstSwap {

	public String[] firstSwap(String[] strings) 
	{
	  HashMap<String, Integer> map=new HashMap<>();
	  ArrayList<String> swapedChars = new ArrayList<>();
	  String arr[]= new String[strings.length];
	 
	  for(int i = 0 ; i < strings.length ; i++)
	  {
	    char firstChar = strings[i].charAt(0);
	    if(!swapedChars.contains(firstChar+"") && map.containsKey(firstChar+""))
	    {
	      swapedChars.add(firstChar+"");
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
