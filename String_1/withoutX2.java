package String_1;

public class withoutX2 
{
	public String withoutX2(String str) 
	{
	  int n = str.length();
	  if(n < 0) return "";
	  String ans = "";
	  if(n >= 1 && str.charAt(0) != 'x') ans += str.charAt(0);
	  if(n >= 2 && str.charAt(1) != 'x') ans+= str.charAt(1);
	  if(n > 2 )ans += str.substring(2, n);
	  return ans;
	}

}
