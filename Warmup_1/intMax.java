package Warmup_1;

public class intMax 
{
	public static int intMax(int a, int b, int c) 
	{
//		  int largest= a > b ? a : b;
//		  return largest > c ? largest : c;
		
		  return a > b ? (a > c ? a : c) : (b > c ? b :c);
	}
}
