package Logic_1;

public class inOrder 
{
	public boolean inOrder(int a, int b, int c, boolean bOk) 
	{
	  if(bOk)
	  {
	    return c > b;  
	  }else
	  {
	    return b > a && c > b;
	  }
	}

}
