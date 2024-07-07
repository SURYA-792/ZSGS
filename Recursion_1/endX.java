package Recursion_1;

public class endX {

	public String endX(String str) 
	{
	  if(str.isEmpty() || !str.contains("x")) return str;
	  
	  if(str.charAt(0)=='x') return endX(str.substring(1)) + str.charAt(0)+"";
	   return str.charAt(0) + endX(str.substring(1));
	}

}
