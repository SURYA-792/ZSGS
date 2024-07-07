package Warmup_2;

public class altPairs 
{
	public String altPairs(String str) 
	{
	  String ans="";
	  for(int i = 0 ; i < str.length() ; i+=4)
	  {
	    ans+=str.charAt(i);
	    if(i+1<str.length()) ans+=str.charAt(i+1);
	  }
	  return ans;
	}

}
