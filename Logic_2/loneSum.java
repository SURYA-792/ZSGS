package Logic_2;

public class loneSum 
{
	public int loneSum(int a, int b, int c) 
	{
	  int sum = 0;
	  if(a!=b && a!=c) sum+=a;
	  if(b!=c && b!=a) sum+=b;
	  if(c!=a && c!=b) sum+=c;
	  
	  return sum;
	}
}
