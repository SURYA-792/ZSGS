package String_1;

public class right2 
{
	public String right2(String str) 
	{
	  int n = str.length();
	  return str.substring(n-2, n) + str.substring(0, n-2);
	}

}
