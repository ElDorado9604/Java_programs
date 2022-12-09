package pack1;

public class P002_ArmstrongNumber_4digit_using_if_else {

	public static void main(String[] args) {
		//4 digit Armstrong number by using if-else
		
		int num = 1634;
		System.out.println("Enter your number = " + num);
		int ud = num%10;
		int tp = (num%100)/10;
		int hu_p = (num/100)%10;
		int th_p = (num/1000);
		int armstrong = (ud*ud*ud*ud)+(tp*tp*tp*tp)+(hu_p*hu_p*hu_p*hu_p)+(th_p*th_p*th_p*th_p);
		
		if(num == armstrong)
		{
			System.out.println("Given number is armstrong.");
		}
		else
		{
			System.out.println("Given number is not armstrong.");
		}
	}

}
