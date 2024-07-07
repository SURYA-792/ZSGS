package String_1;

public class atFirst 
{
	public String atFirst(String str) 
	{
	  int n = str.length();
	  if(n >= 2) return str.substring(0,2);
	  if(n == 1) return str+"@";
	  return "@@";
	}

}
