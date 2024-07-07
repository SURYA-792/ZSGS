package Logic_1;

public class squirrelPlay 
{
	public boolean squirrelPlay(int temp, boolean isSummer) 
	{
	  if(isSummer && temp>=60 && temp<=100) return true;
	  return !isSummer && temp>=60 && temp<=90;
	}

}
