package Logic_1;

public class sumLimit 
{
	public int sumLimit(int a, int b) 
	{
	  int sum = a + b;
	  
	    if( String.valueOf(sum).length() > String.valueOf(a).length())
	    return  a ;
	    else return sum;

	}
}
