package String_2;

public class oneTwo 
{
	public String oneTwo(String str) 
	{
	  String ans = "";
	  for(int i = 0 ; i < str.length() ; i+=3)
	  {
	    if(i+2 >= str.length()) return ans;
	    ans+=str.charAt(i+1);
	    ans+=str.charAt(i+2);
	    ans+=str.charAt(i);
	  }
	  return ans;
	}

}
