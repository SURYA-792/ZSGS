package Recursion_1;

public class countAbc {

	public int countAbc(String str) 
	{
	  if(str.length() < 3)  return 0;
	  String temp = str.substring(0,3);
	  return (temp.equals("aba") || temp.equals("abc") ? 1 : 0) + countAbc(str.substring(1));
	}

}
