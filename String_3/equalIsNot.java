package String_3;
public class equalIsNot 
{
	public boolean equalIsNot(String str) 
	{
	  int is = 0, not = 0;
	  if(str.length()==0) return true;
	  for(int i = 0 ; i < str.length()-2 ; i++)
	  {
	    if(str.substring(i,i+2).equals("is")) is++;
	    if(str.substring(i,i+3).equals("not")) not++;
	  }
	  if(str.substring(str.length()-2).equals("is")) is++; 
	  return not == is;
	}
}
