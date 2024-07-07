package String_3;

public class maxBlock 
{
	public int maxBlock(String str) 
	{
	  int maxi = 0;
	  int count = 1;
	  for(int i = 1 ; i < str.length() ; i++)
	  {
	    if(str.charAt(i) == str.charAt(i-1)) {
	      count++;
	      maxi = Math.max(count, maxi);
	    }
	    else 
	    {
	      count = 1;
	      maxi = Math.max(count, maxi);
	    }
	  }
	  return maxi;
	}

}
