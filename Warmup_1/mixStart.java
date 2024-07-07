package Warmup_1;

public class mixStart 
{
	public static boolean mixStart(String str)
	{
	  if(str.length()>=3 && str.substring(1,3).equals("ix")) return true;
	  return false;
	}
}
