package String_1;

public class hasBad 
{
	public boolean hasBad(String str) 
	{
	    int n = str.length();
	    if(n > 2 && str.substring(0, 3).equals("bad")) return true;
	    if(n > 3 && str.substring(1, 4).equals("bad")) return true;
	    return false;
	}

}
