package Array_1;

public class biggerTwo 
{
	public int[] biggerTwo(int[] a, int[] b) 
	{
	  int aSum = a[0] + a[1];
	  int bSum = b[0] + b[1];
	  if(bSum > aSum) return b;
	  return a;
	  
	}

}
