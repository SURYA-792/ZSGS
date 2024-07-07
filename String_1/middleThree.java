package String_1;

public class middleThree 
{
	public String middleThree(String str) 
	{
	  if(str.length()==3) return str;
	  int n=str.length() / 2;
	  return str.charAt(n-1)+""+ str.charAt(n)+""+ str.charAt(n+1)+"";
	}

}
