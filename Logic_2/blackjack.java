package Logic_2;

public class blackjack 
{
	public int blackjack(int a, int b) 
	{
	  if( a > 21 && b > 21) return 0;
	  int aDiff = 1000000;
	  int bDiff = 1000000;
	  
	  if(a<=21) aDiff = Math.abs(21-a);
	  if(b<=21) bDiff = Math.abs(21-b);
	  
	  if(aDiff < bDiff) return a;
	  return b;
	}

}
