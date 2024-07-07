package String_1;

public class startWord 
{
	public String startWord(String str, String word) 
	{
	  int n = str.length(), m = word.length();
	  if(m < 1)  return "";
	  if(n < m) return "";
	  if(n==1 && m==1) return str;
	  
	  if(str.substring(1, m).equals(word.substring(1, m))) return str.substring(0, m);
	  return "";
	}

}
