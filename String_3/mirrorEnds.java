package String_3;

public class mirrorEnds 
{
	public String mirrorEnds(String string) 
	{
	  int left = 0, right = string.length()-1;
	  String ans = "";
	  while(left < string.length())
	  {
	    if(string.charAt(left)==string.charAt(right)) ans+=string.charAt(left);  
	    else break;
	    left++;
	    right--;
	  }
	  return ans;
	}

}
