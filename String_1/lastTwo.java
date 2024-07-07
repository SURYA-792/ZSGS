package String_1;

public class lastTwo 
{
	public String lastTwo(String str) 
	{
	  int n = str.length();
	  if(n < 2) return str;
	  String ans = str.substring(0,n-2);
	  ans += str.charAt(n-1)+"" + str.charAt(n-2)+"";
	  return ans;
	}

}
