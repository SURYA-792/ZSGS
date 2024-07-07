package Array_2;

public class fizzBuzz {

	public String[] fizzBuzz(int start, int end) 
	{
	  String arr[]=new String[end-start];
	  int index=0;
	  while(start < end)
	  {
	    String str = start+"";
	    if(start % 3 == 0) str = "Fizz";
	    if(start % 5 == 0) str = "Buzz";
	    if(start % 3 == 0 && start % 5 == 0) str = "FizzBuzz";
	    arr[index++] = str;
	    start++;
	  }
	  return arr;
	}

}
