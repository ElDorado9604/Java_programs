package pack1;

    public class P021_ReverseNumber_3rd_way {
    	
	public static void main(String[] args) {

		int num = 128;
		System.out.println("Given Number = " + num);
		
		int mult = 1;
		for(int i = num ; i != 0 ; i = i / 10)
		{
			mult = mult * 10 ;
		}
		
		int sum = 0;
		for(int j = mult/10 ; j > 0 ; j = j / 10)
		{
			int unit = num % 10;
			sum = sum + unit * j ;
			num = num/10;
		}
		System.out.println("Reverse Number = " + sum);
	}
}
