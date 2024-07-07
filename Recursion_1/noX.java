package Recursion_1;

public class noX {

	public String noX(String str) 
	{
	  if(str.length()==0) return "";
	  char ch = str.charAt(0);
	  return (ch!='x' ? ch : "") + noX(str.substring(1));
	}

}
