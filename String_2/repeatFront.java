package String_2;

public class repeatFront {

	public String repeatFront(String str, int n) 
	{
	  String ans = "";
	  String front = str.substring(0, n);
	  for(int i = 1 ; i < n ; i++){
	    ans+=front;
	    front=front.substring(0,n-i);
	  }
	  return ans+front;
	}

}
