package Logic_1;

public class shareDigit 
{
	public boolean shareDigit(int a, int b) 
	{
	  int last = a % 10;
	  int first = (a / 10) % 10 ;
	      if(last == (b % 10) || last == (b / 10) % 10) return true;
	      if(first == (b % 10) || first == (b / 10) % 10) return true;
	      return false;
	}

}
