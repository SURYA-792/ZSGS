package Warmup_1;

public class notString 
{
	public static String notString(String str) 
	{
		  if(str.length()<3) return "not "+str;
		  
		  return str.substring(0, 3).equals("not") ? str : "not " + str;
	}	
}
