package pack1;

public class P010_Fibonacci_Series {
	public static void main(String[] args) {
		//Fibonacci Series - First do the swappingNumbers Program
		
		int a = 0; 
		int b = 1;
	
		for(int i = 1 ; i <= 15 ; i++)
		{
			int c = a + b ;
			System.out.println(a);
			//System.out.println(c + " " + a  + " " + b);
			b = a;
			a = c;
		}
	}
}

//  c	=	a	+	b 
//	1	=	0	+	1
//	1	=	1	+	0
//	2	=	1   +   1					//idhar 'a' ki value 'b' ko transfer ho rahi hai
//	3	=	2	+	1					//and 'c' ki value 'a' ko transfer ho rahi hai
//	5	=	3	+	2
//	8	=	5   +	3
//	13	=	8	+	5
//	21	=	13  +	8
//	34	=	21	+	13
//	55	=	34	+	21

















//System.out.println(a);
//System.out.println(b);
//
//for(int i = 1 ; i < num ; i++ )
//{
//	int c = a;
//	 
//	a = b; 
//	b = c;
//
//	c = a + b;
//	System.out.println("c = " + c);