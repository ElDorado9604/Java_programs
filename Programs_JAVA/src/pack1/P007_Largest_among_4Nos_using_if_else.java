package pack1;

public class P007_Largest_among_4Nos_using_if_else {
	public static void main(String[] args) {
		
	//Finding largest number among a,b,c,d.
			int a = 25;
			int b = 50;
			int c = 750;
			int d = 100;
			
			if(a>b)
			{
				if(a>c)
				{
					if(a>d)
					{
						System.out.println("a is greater.");
					}
					else
					{
						System.out.println("d is greater");
					}
				}
				else
				{
					if(c>d)
					{
						System.out.println("c is greater");
					}
					else
					{
						System.out.println("d is greater");
					}
				}
			}
			else
			{
				if(b>c)
				{
					if(b>d)
					{
						System.out.println("b is greater");
					}
					else
					{
						System.out.println("d is greater");
					}
				}
				else
				{
					if(c>d)
					{
						System.out.println("c is greater");
					}
					else
					{
						System.out.println("d is greater");
					}
				}
			}
	}
}
