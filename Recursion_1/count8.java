package Recursion_1;

public class count8 {

	public int count8(int n) 
	{
	  if(n<=0) return 0;  
	  
	  int lastDigit = n % 10;
	  int remDigits = n / 10;

	 int count =  count8(remDigits);
	  
	  if(lastDigit == 8 && remDigits % 10 == 8) return count += 2;
	  if(lastDigit == 8) return count += 1;
	  return count;
	  
	}

}
