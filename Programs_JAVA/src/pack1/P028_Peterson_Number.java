package pack1;

public class P028_Peterson_Number {
	public static void main(String[] args) {
		//Peterson Number
//if the sum of factorials of each digit is equal to number itself.

		
		int num = 145 ;
		
		int sum = 0 ;
		for(int i = num ; i > 0 ; i = i/10)
		{
			int unit = i % 10 ;
			
			int factorial = unit;
			for(int j = unit - 1 ; j > 0 ; j-- )
			{
				factorial = factorial * j;
			}
			sum = sum + factorial;
		}
		if( num == sum )
		{
			System.out.println(num + " is Peterson number.");
		}
		else
		{
			System.out.println(num + " is not Peterson number.");
		}
	}
}
