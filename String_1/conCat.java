package String_1;

public class conCat 
{
	public String conCat(String a, String b) 
	{
	  String ans = "";
	  int aLen = a.length();
	  int bLen = b.length();
	  if(aLen > 0) ans += a.substring(0, aLen-1)+"";
	  if(aLen!=0 && bLen!=0 && a.charAt(aLen-1)==b.charAt(0))
	  {
	    ans += b.charAt(0)+b.substring(1,bLen);  
	  }else return a + b;
	  return ans;
	}

}
