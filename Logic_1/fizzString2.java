package Logic_1;

public class fizzString2 
{
	public String fizzString2(int n) 
	{

	  String ans = n+"";
	  if(n % 3 == 0) ans = "Fizz";
	  if(n % 5 == 0) ans = "Buzz";
	  if(n % 3 == 0 && n % 5 == 0) ans = "FizzBuzz";
	  return ans+"!";
	}

}
