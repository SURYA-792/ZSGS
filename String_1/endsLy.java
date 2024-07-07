package String_1;

public class endsLy 
{
	public boolean endsLy(String str) 
	{
	  int n = str.length();
	  if(n < 2) return false;
	  
	  return str.substring(n-2, n).equals("ly");
	}

}
