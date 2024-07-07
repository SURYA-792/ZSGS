package Logic_2;

public class closeFar 
{
	public boolean closeFar(int a, int b, int c) 
	{
	    boolean bIsClose = (Math.abs(a - b) <= 1);
	    boolean cIsClose = (Math.abs(a - c) <= 1);
	    boolean bIsFar = (Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2);
	    boolean cIsFar = (Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2);

	    return (bIsClose && cIsFar) || (cIsClose && bIsFar);
	}

}
