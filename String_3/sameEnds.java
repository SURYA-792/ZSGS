package String_3;

public class sameEnds 
{
	public String sameEnds(String string) 
	{
	  if(string.length() <= 1) return "";
	  String ans = "";
	  int mid = string.length() / 2;
	  for(int i=0 ; i <= mid ; i++)
	  {
	      if(string.endsWith(string.substring(0, i))) ans = string.substring(0, i);
	  }
	  return ans;
	}

}
