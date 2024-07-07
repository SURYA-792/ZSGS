package String_1;

public class frontAgain 
{
	public boolean frontAgain(String str) 
	{
	  if(str.length() < 2) return false;
	  int n = str.length();
	  return str.substring(0,2).equals(str.substring(n-2, n));
	}
}
