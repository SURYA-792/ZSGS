package String_2;

public class endOther {

	public boolean endOther(String a, String b) 
	{
	  a=a.toLowerCase();
	  b=b.toLowerCase();
	  int aLen = a.length(), bLen = b.length();
	  
	  if(aLen < bLen) return (b.substring(bLen-aLen, bLen).equals(a));
	  else  return (a.substring(aLen-bLen, aLen).equals(b));
	  // return a.endsWith(b) || b.endsWith(a);
	}

}
