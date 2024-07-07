package Warmup_1;

public class front3 
{
	public static String front3(String str) 
	{
		  String front = str;
		  if(str.length()>3) front=str.substring(0,3);
		  
		  return front + front + front;
	}
}
