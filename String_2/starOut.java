package String_2;

public class starOut {

	public String starOut(String str) 
	{
	  String ans = "";
	  for(int i = 0 ; i < str.length() ; i++)
	  {
	    if(str.charAt(i)=='*') continue;
	    if(i-1 >=0 && str.charAt(i-1)=='*') continue;
	    if(i+1 < str.length() && str.charAt(i+1)=='*') continue;
	     ans+=str.charAt(i);
	  }
	  return ans;
	}

}
