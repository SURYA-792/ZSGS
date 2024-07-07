package Recursion_1;

public class changePi {

	public String changePi(String str) 
	{
	  if(str.length()<=0 || !str.contains("pi")) return str;
	  String check = str.substring(0, 2);
	  if(check.equals("pi")) return "3.14"+ changePi(str.substring(2));
	  else return str.charAt(0) + changePi(str.substring(1));
	}

}
