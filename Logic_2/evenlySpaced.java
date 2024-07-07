package Logic_2;

import java.util.Arrays;

public class evenlySpaced 
{
	public boolean evenlySpaced(int a, int b, int c) 
	{
	  int arr[] = {a,b,c};
	  Arrays.sort(arr);
	  int diff = Math.abs(arr[0]-arr[1]);
	  
	  return diff == Math.abs(arr[1]-arr[2]);
	}
}
