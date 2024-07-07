package Warmup_2;

public class stringBits 
{
	public String stringBits(String str) 
	{
	  String ans="";
	  for(int i=0;i<str.length();i+=2)
	  {
	    ans += str.substring(i, i+1); 
	  }
	  return ans;
	}

}
