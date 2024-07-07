package String_1;

public class theEnd 
{
	public String theEnd(String str, boolean front) 
	{
	  return front ? str.charAt(0)+"" : str.charAt(str.length()-1)+"";
	}

}
