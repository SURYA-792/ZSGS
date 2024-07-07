package String_3;

public class sumNumbers 
{
	public int sumNumbers(String str) 
	{
	  String temp ="";
	  int sum = 0;
	  for(int i = 0 ; i < str.length() ; i++)
	  {
	      if(Character.isDigit(str.charAt(i)))
	      {
	        temp+=str.charAt(i);
	      }else if(!temp.isEmpty())
	      {
	        sum+=Integer.parseInt(temp);
	        temp="";
	      }
	  }
	  if(!temp.isEmpty()) sum+=Integer.parseInt(temp);
	  return sum;
	}

}
