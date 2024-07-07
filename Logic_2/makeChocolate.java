package Logic_2;

public class makeChocolate 
{
	public int makeChocolate(int small, int big, int goal) 
	{
	  if(goal > (big*5) + small) return -1;
	  
	  int rem = 0;
	  while(goal >= 5 && big > 0){
	    goal-=5;
	    big--;
	  }
	  return goal <= small ?  goal : -1;
	  
	}
}
