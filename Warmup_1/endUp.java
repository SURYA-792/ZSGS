package Warmup_1;

public class endUp 
{
	public static String endUp(String str) 
	{
		  int n=str.length();
		  if(n < 3) return str.toUpperCase();
		  return str.substring(0, n-3) + str.substring(n-3, n).toUpperCase();
	}
}
