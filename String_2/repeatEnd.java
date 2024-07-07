package String_2;

public class repeatEnd {

	public String repeatEnd(String str, int n) 
	{
	  String ans = "";
	  // if(n == 0) return str;
	  String last = str.substring(str.length()-n);
	  
	  for(int i = 0 ; i < n ; i++) ans += last;
	  return ans;
	}

}
