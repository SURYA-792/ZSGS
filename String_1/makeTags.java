package String_1;

public class makeTags 
{
	public String makeTags(String tag, String word) 
	{
		String ans = "";
		ans += "<" + tag + ">" + word + "</" + tag + ">";
		return ans;
	}

}
