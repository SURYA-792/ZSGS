package Warmup_2;

public class last2 
{
	public int last2(String str) 
	{
	  int n = str.length();  
	  int count = 0;
	  if(n < 2) return 0;
	  String last2chars = str.substring(n-2, n);
	  for(int i = 0 ; i < n-2 ; i++)
	  {
	      if(str.substring(i, i+2).equals(last2chars)) count++;
	  }
	  return count;
	}

}
