package String_1;

public class minCat 
{
	public String minCat(String a, String b) 
	{
	  int aLen = a.length(), bLen = b.length();
	  String ans = "";
	  if(aLen < bLen)
	  {
	    ans += a + b.substring(bLen-aLen, bLen);
	  }
	  else if(aLen > bLen)
	  {
	    ans += a.substring(aLen-bLen, aLen) + b  ;
	  }
	  else ans = a + b;
	  
	  return ans;
	}

}
