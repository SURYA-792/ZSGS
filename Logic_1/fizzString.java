package Logic_1;

public class fizzString 
{
	public String fizzString(String str) 
	{
	  String ans = str;
	  if(str.charAt(0)=='f') ans = "Fizz";
	  if(str.charAt(str.length()-1)=='b') ans = "Buzz";
	  if(str.charAt(0)=='f' && str.charAt(str.length()-1)=='b') ans = "FizzBuzz";
	  
	  return ans;
	}
}
