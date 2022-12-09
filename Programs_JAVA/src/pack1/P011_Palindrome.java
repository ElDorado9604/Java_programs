package pack1;

public class P011_Palindrome {

	public static void main(String[] args) {
		
		int num = 121;
		
		int rev = 0 ; 
		for(int i = num ; i > 0 ; i = i / 10)
		{
			rev = rev * 10 + i % 10;
		}
		
		if(num == rev)
		{
			System.out.println("Given number is Palindrome Number.");
		}
		else
		{
			System.out.println("Given number is not Palindrome Number.");
		}

	}
}
