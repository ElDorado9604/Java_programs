package pack1;

public class P003_Armstrong_number_3digit_using_for_loop {

	public static void main(String[] args) {
		//Armstrong number 3 digit by using for-loop
		
		int num = 407;
		System.out.println("Number = " + num );
		
		int sum = 0;
		for(int i = num; i > 0 ; i = i / 10)
		{
			int unit = i % 10 ;
			sum = sum + (unit*unit*unit);
		}
		
		if(sum == num)
		{
			System.out.println("Given number is armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}
