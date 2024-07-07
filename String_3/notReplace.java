package String_3;

public class notReplace 
{
	public String notReplace(String str) 
	{
	  String ans = "";
	  if(str.length() < 2) return str;
	  if(str.equals("isis")) return str;
	  
	  for(int i = 0 ; i < str.length() ; i++)
	  {
	    if(i+1 < str.length() && str.charAt(i)=='i' && str.charAt(i+1)=='s')
	    {
	      if(i == 0 || !Character.isLetter(str.charAt(i-1)) && 
	        (i+2 ==str.length() || !Character.isLetter(str.charAt(i+2))) ) {
	        ans+="is not";
	        i++;
	      }else ans+=str.charAt(i);
	    }
	    else ans+=str.charAt(i);
	  }
	  return ans;
	}

}
