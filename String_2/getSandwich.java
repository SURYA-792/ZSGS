package String_2;

public class getSandwich {

	public String getSandwich(String str) 
	{
	  int firstBread=-1, lastBread=-1;
	  for(int i=0 ; i < str.length()-5 ; i++)
	  {
	      if(str.substring(i,i+5).equals("bread"))
	      {
	        firstBread=i;
	        break;
	      }
	  }
	  
	  for(int i=str.length()-5 ; i >=0  ; i--)
	  {
	      if(str.substring(i,i+5).equals("bread"))
	      {
	        lastBread=i;
	        break;
	      }
	  }
	  if(firstBread!=-1 && lastBread!=-1 && firstBread!=lastBread){
	    return str.substring(firstBread+5, lastBread);
	  }
	  return "";
	}

}
