package pack1;

public class P001_ArmstrongNumber_3digit_using_if_else {

	public static void main(String[] args) {
		//Armstrong Number 3 digit
		
		int num = 371;
		System.out.println("Enter your number = " + num);
		int unit_digit = num%10;
		int tenth_place = (num%100)/10;
		int hund_place = num/100;
		
		int armstrong = (unit_digit*unit_digit*unit_digit)+(tenth_place*tenth_place*tenth_place)+(hund_place*hund_place*hund_place);
		
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
