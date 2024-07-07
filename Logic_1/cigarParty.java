package Logic_1;

public class cigarParty 
{
	public boolean cigarParty(int cigars, boolean isWeekend) 
	{
	  if(!isWeekend && cigars >= 40 && cigars <= 60) return true;
	  if(isWeekend && cigars>=40) return true;
	  return false;
	}
}
