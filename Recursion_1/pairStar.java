package Recursion_1;

public class pairStar {

	public String pairStar(String str) 
	{
	  if(str.length() < 2) return str;
	  char ch = str.charAt(0);
	  if(str.charAt(1)== ch) return ch+"*" + pairStar(str.substring(1));
	  else return ch+pairStar(str.substring(1));
	}

}
