package Logic_1;

public class withoutDoubles 
{
	public int withoutDoubles(int die1, int die2, boolean noDoubles) 
	{
	  if(noDoubles){
	    if(die1==6 && die2==6) return 7;
	    return die1==die2 ? die1+die2+1 : die1+die2;
	  }
	  else return die1 + die2;
	}

}
