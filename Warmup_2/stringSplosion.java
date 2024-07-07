package Warmup_2;

public class stringSplosion 
{
	public static String stringSplosion(String str) 
	{
		  String ans="";
		  for(int i = 1 ; i <= str.length() ; i++) ans+= str.substring(0,i);
		  return ans;
	}
}
