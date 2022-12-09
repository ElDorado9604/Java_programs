package pack1;

public class P016_HCF {

	public static void main(String[] args) {
		//HCF of two numbers
		
		int num1 = 96;
		int num2 = 560;
		
		for(int i = num2 ; i > 0 ; i--)
		{
			int remainder1 = num1 % i;
			int remainder2 = num2 % i;
			
			if(remainder1 == 0)
			{
				if(remainder2 == 0)
				{
					System.out.println("HCF = " + i);
					break;
				}
			}
		}
		
	}
}
