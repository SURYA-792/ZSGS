package Array_3;

public class linearIn 
{
	public boolean linearIn(int[] outer, int[] inner) 
	{
	  int left = 0, right = 0;
	  while(left < outer.length && right < inner.length)
	  {
	    if(outer[left] > inner[right]) return false;
	    if(outer[left] < inner[right]) left++;
	    else {
	      right++;
	      left++;
	    }
	  }
	  if(right == inner.length)return true;
	  return false;
	}

}
