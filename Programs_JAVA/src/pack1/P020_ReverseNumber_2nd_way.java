package pack1;
public class P020_ReverseNumber_2nd_way {
	public static void main(String[] args) {
		//Reverse Number - my way
		
		int num = 1234;
		System.out.println("Your Number = " + num);
		int numcopy = num;
		
		int digits;
		for(digits = 0 ; numcopy != 0 ; digits++)
		{
			numcopy = numcopy/10;
		}
		
		int mult = 1;	//find highest multiplier
		for(int i = digits -1 ; i > 0 ; i--)
		{
			mult = mult * 10 ;
		}
		
		int sum = 0;
		for(int j = mult ; j > 0 ; j = j/10)
		{
			int unit = num % 10;
			sum = sum + (unit * j) ;
			num = num/10 ;
		}
		System.out.println("Reverse Number = " + sum);
	}
}
