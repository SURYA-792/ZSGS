package String_1;

public class nTwice 
{
	public String nTwice(String str, int n) 
	{
	  int strLen = str.length();
	  return str.substring(0, n) + str.substring(strLen - n, strLen);
	}

}
