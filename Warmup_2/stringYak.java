package Warmup_2;

public class stringYak 
{
	public String stringYak(String str) 
	{
	  String ans="";
	  for(int i = 0 ; i < str.length() ; i++)
	  {
	    if(i+2 < str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') i+=2;
	    else ans+=str.charAt(i);
	  }
	  return ans;
	}

}
