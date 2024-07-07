package Warmup_1;

public class startOz 
{
	public static String startOz(String str) 
	{
	  String ans ="";
	  if(str.length() > 0 && str.charAt(0) == 'o') ans=str.charAt(0)+"";
	  if(str.length() > 1 && str.charAt(1) == 'z') ans+= str.charAt(1);
	  return ans;
	}
}
