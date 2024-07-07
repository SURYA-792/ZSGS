package Recursion_1;

public class allStar {

	public String allStar(String str) 
	{
	  if(str.isEmpty() || str.length()==1) return str;
	  
	  return str.charAt(0)+"*"+ allStar(str.substring(1));
	}

}
