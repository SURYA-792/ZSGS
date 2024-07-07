package Warmup_2;

public class stringMatch 
{
	public int stringMatch(String a, String b) 
	{
	  int count = 0;  
	  int aLen = a.length(), bLen = b.length();
	  int n = Math.min(aLen, bLen);
	  for(int i = 0 ; i <= n-2 ; i++)
	  {
	    if(a.substring(i, i+2).equals(b.substring(i, i+2))) count++;
	  }
	  return count;
	}

}
