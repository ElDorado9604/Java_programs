package pack1;

public class P022_Printing1to100without_anyLoop {
	//print 1 to 100 without any loop
	
	public static void print1to100 (int a)
	{
		if(a <= 100)
		{
			System.out.print(a + " ");
			print1to100(a+1);
		}
	}
	
	public static void main(String[] args) {
		print1to100(1);
		
	}
}
