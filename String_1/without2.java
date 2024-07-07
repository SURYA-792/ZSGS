package String_1;

public class without2 
{
	public String without2(String str) 
	{
	  int n = str.length();
	  if(n <= 1) return str;
	  return str.substring(0,2).equals(str.substring(n-2, n)) ? str.substring(2, n) : str;
	}

}
