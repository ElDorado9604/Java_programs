package pack1;

public class P006_Factorial_of_given_number {
	public static void main(String[] args) {
		//Find factorial of given number
		
		int n = 5;
		System.out.println("Find factorial of given number");
		System.out.println("Enter Number = " + n);
		int d = n ; //Copy
		
		if(n==0)
		{
			System.out.println("0! = 1");
		}
		else
		{
			for(int i = (d-1) ;  i > 0   ;i--)
			{
				n = n * i ;
			}
			System.out.println(d+ "! = " + n);
		}
	}	
}
