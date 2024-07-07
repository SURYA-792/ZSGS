package String_2;

public class repeatSeparator {

	public String repeatSeparator(String word, String sep, int count) 
	{
	  String ans = "";
	  if(count==0) return "";
	  for(int i = 1 ; i < count ; i++)
	  {
	    ans += word;
	    ans += sep;
	  }
	  return ans + word;
	}

}
