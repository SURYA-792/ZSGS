package Warmup_2;

public class countXX 
{
	static int  countXX(String str) 
	{
		  int n=str.length();
		  int count=0;  
		  for(int i = 0 ; i < n-1 ; i++)
		    if(str.charAt(i)=='x' && str.charAt(i+1)=='x') count++;
		  return count;  
	}
}
