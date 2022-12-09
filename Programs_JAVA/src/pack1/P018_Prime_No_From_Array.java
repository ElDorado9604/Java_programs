package pack1;

public class P018_Prime_No_From_Array {

	public static void main(String[] args) {
		//Extract Prime Numbers From Array
		int a [] = {1,2,3,4,5,6,7,8,9,11,17,18,24,31,37};
		
		for(int i = 0 ; i < a.length ; i++)
		{
			int k = 0;
			int m = 0;
			for(int j = a[i] ; j > 0 ; j--)
			{
				if(a[i] % j == 0)
				{
					k++;
				}	
			}
			if(k == 2)
			{
				int c [] = new int[a.length];
				c[m] = a[i];
				System.out.print(c[m] + ",");
				m++;
			}
		}
					
	}
}
