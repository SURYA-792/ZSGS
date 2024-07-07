package String_1;

public class deFront 
{
	public String deFront(String str) 
	{    
	  String ans = "";
	  int n = str.length();
	  
	    if(n >= 1 && str.charAt(0) == 'a')  ans += "a";
	     
	    if(n >= 2 && str.charAt(1) == 'b') ans += "b";
	    
	    if(n>=2)ans += str.substring(2,n);
	    return ans;
	}

}
