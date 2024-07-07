package String_2;

public class xyzMiddle 
{
	public boolean xyzMiddle(String str) 
	{
	  if(str.length() <=2 ) return false;
	  if(str.length() % 2 == 0)
	  {
	    return (str.substring(str.length() / 2 - 2, str.length() / 2 +1).equals("xyz")) || 
	            (str.substring(str.length() / 2 - 1, str.length() / 2 +2).equals("xyz")) ;
	  }
	  return (str.substring(str.length() / 2 - 1, str.length() / 2 +2).equals("xyz"));
	}

}
