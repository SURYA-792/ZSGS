package String_2;

public class mixString {

	public String mixString(String a, String b) 
	{
	  String ans = "";
	  int min = Math.min(a.length(), b.length());
	  for(int i = 0 ; i < min ; i++)
	  {
	    ans += a.charAt(i);
	    ans += b.charAt(i);
	  }
	  if(a.length()==min) ans+= b.substring(min);
	  else ans += a.substring(min);
	  return ans;
	}

}
