package Warmup_2;

public class doubleX 
{
	static boolean  doubleX(String str) 
	{
		  for(int i = 0 ; i < str.length()-1 ; i++)
		  {
		    if(str.charAt(i)=='x')
		    {
		      if( str.charAt(i+1)=='x') return true;  
		      return false;
		    }
		  }
		  return false;
	}
}
