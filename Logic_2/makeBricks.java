package Logic_2;

public class makeBricks 
{
	public boolean makeBricks(int small, int big, int goal) 
	{
	  if(goal > big*5+small) return false;
	  
	  if(goal % 5 > small) return false;
	  return true;
	}

}
