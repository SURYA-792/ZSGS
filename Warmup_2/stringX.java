package Warmup_2;

public class stringX 
{
	public String stringX(String str) 
	{
		  int n = str.length();
		  if(n <= 1) return str;
		  String ans = "";
		  for(int i = 1 ; i < n-1 ; i++)
		  {
		    if(str.charAt(i) != 'x') ans += str.charAt(i);
		  }
		  ans += str.charAt(n-1);
		  ans = str.charAt(0) + ans;
		  return ans;
	}

}
