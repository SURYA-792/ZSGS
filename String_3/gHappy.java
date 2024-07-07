package String_3;

public class gHappy 
{
	public boolean gHappy(String str) 
	{
	  if(str.length() == 0) return true; 
	  if(str.length() == 1 && str.charAt(0) == 'g') return false;
	  for(int i = 0 ; i < str.length() ; i++)
	  {
	    if(str.charAt(i)=='g')
	    {
	      if ( (i== 0               || str.charAt(i-1)!='g') &&  
	           (i == str.length()-1 || str.charAt(i+1)!='g') )return false;
	    }
	  }  
	  if(str.charAt(0)=='g' && str.charAt(str.length()-1)=='g') return true;
	  return true;
	}

}
