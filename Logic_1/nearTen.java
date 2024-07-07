package Logic_1;

public class nearTen 
{
	public boolean nearTen(int num) 
	{
	  if(num % 10 <=2) return true;
	  return num % 10 >=8;
	}

}
