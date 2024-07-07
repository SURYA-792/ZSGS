package Array_1;

public class front11 
{
	public int[] front11(int[] a, int[] b) 
	{
	  int n = 0;
	  n = a.length == 0 || b.length == 0 ? 1 : 2;
	  if( a.length == 0 && b.length == 0) n = 0;
	  int arr[] = new int[n];
	  int j = 0;
	  if(a.length >= 1) arr[j++] = a[0];
	  if(b.length >= 1) arr[j++] = b[0];
	  

	  return arr;
	}

}
