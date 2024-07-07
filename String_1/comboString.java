package String_1;

public class comboString 
{
	public String comboString(String a, String b) 
	{
	  int aLen = a.length();
	  int bLen = b.length();
	  
	  if(aLen < bLen) return a+b+a;
	  return b+a+b;
	}

}
