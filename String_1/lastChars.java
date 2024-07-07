package String_1;

public class lastChars 
{
	public String lastChars(String a, String b) 
	{
	  String ans = "";
	  ans+= a.length() > 0 ? a.charAt(0) : "@";
	  ans+= b.length() > 0 ? b.charAt(b.length()-1) : "@";
	  return ans;
	}

}
