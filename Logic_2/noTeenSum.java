package Logic_2;

public class noTeenSum 
{
	public int noTeenSum(int a, int b, int c) 
	{
	  int sum = 0;
	  sum += fixTeen(a);
	  sum += fixTeen(b);
	  sum += fixTeen(c);
	  return sum;
	}
	public int fixTeen(int age){
	  if(age==15 || age==16) return age;
	  return age>=13 && age<=19 ? 0 : age;
	}

}
