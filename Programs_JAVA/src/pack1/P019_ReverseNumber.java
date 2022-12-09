package pack1;

public class P019_ReverseNumber {

	public static void main(String[] args) {
		// Reverse Number
		
		int num = 1234;
		
		//Using While-loop
		int Rev = 0;
		while(num != 0)
		{
			Rev = Rev*10 + num%10;
			num = num/10;
		}
		System.out.println(Rev);
		
//	    Using for loop
//		int Rev = 0;
//		for(int i = num ; i > 0 ; i = i/10)
//		{
//			Rev = Rev*10 + i%10;
//		}
//		System.out.println(Rev);
	}
	// (0 * 10 + 4) > (4 * 10 + 3) > (43 * 10 + 2) > (432 * 10 + 1) = 4321
}
