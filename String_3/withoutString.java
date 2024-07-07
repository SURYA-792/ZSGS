package String_3;

public class withoutString 
{
	public String withoutString(String base, String remove) 
	{
	 
	  int n = base.length();
	  int m = remove.length();
	  String ans = "";
	  for(int i = 0 ; i < n ; i++)
	  {
	    if(i + m <= n && base.substring(i, i+m).equalsIgnoreCase(remove)){
	      i+=m-1;
	    } 
	    else ans+=base.charAt(i);
	  }
	  return ans;
	}

}
