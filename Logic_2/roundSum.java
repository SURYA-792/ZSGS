package Logic_2;

public class roundSum 
{
	public int roundSum(int a, int b, int c) 
	{
	   return round10(a) + round10(b) + round10(c);
	}
	public int round10(int num)
	{
	  if(num % 10 >= 5)  return num - (num % 10) + 10;
	   else return num - (num % 10);
	}

}
