package pack1;

public class P029_PeakValueAdditionFromArray {

	public static void main(String[] args) {
		//compare each number with previous and next number, then get the addition of peak
		//values after comparing.
		int a [] = {3,7,5,8,23,16,55,43,31};
		int sum = 0 ;
		
		if(a[0] > a[1])
		{
			sum = sum + a[0];
		}
		else
		{
			sum = sum + a[1];
		}
		
		if( a[a.length-1] > a[a.length-2] )
		{
			sum = sum + a[a.length-1];
		}
		else
		{
			sum = sum + a[a.length-2];
		}
		
		for(int i = 1 ; i < a.length-1 ; i++)
		{
			if(a[i] > a[i+1]  &&  a[i] > a[i-1] )
			{
				sum = sum + a[i];
			}
			else if(a[i+1] > a[i]  &&  a[i+1] > a[i-1])
			{
				sum = sum + a[i+1];
			}
			else
			{
				sum = sum + a[i-1];
			}	
		}
		System.out.println("sum = " + sum); //7+43+7+8+23+23+55+55+55
	}
}
