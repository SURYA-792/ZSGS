package Logic_1;

public class twoAsOne 
{
	public boolean twoAsOne(int a, int b, int c) 
	{
	  if(a + b == c)  return true;
	  if(b + c == a) return true;
	  if(a + c == b) return true;
	  return false;
	}

}
