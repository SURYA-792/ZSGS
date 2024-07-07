package Array_1;

public class make2 
{
	public int[] make2(int[] a, int[] b) 
	{
	  int arr[] = new int[2];
	  int index = 0, i = 0;
	  while(i < a.length && index < 2){
	    arr[index++]=a[i];
	    i++;
	  }
	  i=0;
	  while(i < b.length && index < 2){
	    arr[index++]=b[i];
	    i++;
	  }
	  return arr;
	}

}
