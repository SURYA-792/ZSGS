package Logic_1;

public class alarmClock 
{
	public String alarmClock(int day, boolean vacation) 
	{
	  if(vacation && day>=1 && day<=5) return "10:00";
	  if(vacation && (day==0 || day==6)) return "off";
	  
	  if(day>=1 && day<=5) return "7:00";
	  return "10:00";
	}

}
