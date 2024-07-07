package Warmup_2;

public class frontTimes 
{
	public static String frontTimes(String str, int n) 
	{
		  if(str.length() > n )  str = str.substring(0,3);
		  String ans = "";
		  for(int i = 1 ; i <= n ; i++) ans += str;
		  return ans;
	}
}
