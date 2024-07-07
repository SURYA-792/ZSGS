package String_1;

public class extraEnd 
{
	public String extraEnd(String str) 
	{
	  int n=str.length();
	  String substring = str.substring(n-2,n);
	  return substring + substring + substring;
	}

}
