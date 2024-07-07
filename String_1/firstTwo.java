package String_1;

public class firstTwo 
{
	public String firstTwo(String str) 
	{
	  int n = str.length();
	  if(n < 2) return str;
	  return str.substring(0,2);

	}

}
