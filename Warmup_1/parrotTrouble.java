package Warmup_1;

public class parrotTrouble 
{
	public static boolean parrotTrouble(boolean talking, int hour) 
	{
		  return talking && ( hour < 7 || hour > 20);
	}
}
