package Recursion_1;

public class changeXY {

	public String changeXY(String str) 
	{
	  if(str.length() <= 0) return str;
	  
	  char ch = str.charAt(0);
	  if(ch == 'x') ch='y';
	  
	  return ch + changeXY(str.substring(1));
	}

}
