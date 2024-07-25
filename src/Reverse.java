import java.util.Scanner;

public class Reverse
{
	
	static int reverse(int num)
	{
		int reverse=0;
		while(num!=0)
		{
		int remainder=num%10;
		 reverse=reverse*10+remainder;
		num=num/10;
		}
		return reverse;
		
	}

	
	
}

