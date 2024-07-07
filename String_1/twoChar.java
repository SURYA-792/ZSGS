package String_1;

public class twoChar 
{
	public String twoChar(String str, int index) 
	{
	  int n = str.length();
	  if(index > 0 && index <= n-2 ) return str.substring(index, index+2);
	  return str.substring(0,2);
	}

}
