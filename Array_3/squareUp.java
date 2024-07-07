package Array_3;

public class squareUp 
{
	public int[] squareUp(int n) 
	{
	  int arr[] = new int[n*n];
	  int index = 0;
	  for(int i = 1 ; i <= n ; i++)
	  {
	      index += n;
	      for(int j=1;j<=i;j++){
	        arr[index-j]=j;
	      }
	  }
	  return arr;
	}

}
