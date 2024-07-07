package String_1;

public class withoutX 
{
	public String withoutX(String str) 
	{
	  int n = str.length();
	  String ans="";
	  if(n < 0) return str;
	  if(n >=1 && str.charAt(0)!='x') ans += str.charAt(0);
	  if(n > 2) ans += str.substring(1, n-1);
	  if(n >= 1 && str.charAt(n-1)!='x')  ans += str.charAt(n-1);
	  
	  return ans;
	}

}
