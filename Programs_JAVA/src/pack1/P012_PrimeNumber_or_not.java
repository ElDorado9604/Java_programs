 package pack1;

public class P012_PrimeNumber_or_not {
	public static void main(String[] args) {
		//Prime Number
		int num = 5099;
		
		int factors = 0;
		for(int i = num ; i >0 ; i--)
		{
			int remainder = num % i ;
			
			if(remainder == 0)
			{
				factors++;
			}	
		}
		if(factors != 2)
		{
			System.out.println("Given number is not prime");
		}
		else
		{
			System.out.println("Given number is prime");
		}
	}
}
