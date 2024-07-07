package String_3;

public class CountYZ 
{
	public int countYZ(String str) 
	{
	  str = str.toLowerCase();
	  if(str.length()==0) return 0;
	  int count = 0;
	  
	  for(int i = 0 ; i <= str.length()-2 ; i++)
	  {
	    char ch = str.charAt(i);
	    if( (ch == 'z' || ch == 'y') && !Character.isLetter(str.charAt(i+1)))count++;
	  }
	  
	  char ch = str.charAt(str.length()-1);
	  
	  if(ch == 'z' || ch == 'y') count++;
	  return count;
	}
}
