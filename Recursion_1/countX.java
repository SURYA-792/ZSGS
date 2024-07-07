package Recursion_1;

public class countX {

	public int countX(String str) 
	{
	    if(str.length() <= 0) return 0;
	    return (str.charAt(0)=='x' ? 1 : 0) + countX(str.substring(1));
	}

}
