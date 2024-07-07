package Warmup_1;

public class max1020 
{
	public static int max1020(int a, int b) 
	{
		  int aValid=0;
		  int bValid=0;
		  if(a >= 10 && a <= 20) aValid = a;
		  if(b >= 10 && b <= 20) bValid = b;
		  return Math.max(aValid, bValid);
	}
}
