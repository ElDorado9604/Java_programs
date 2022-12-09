package pack1;

public class P014_Find_Duplicate_numbers_array {
	
	static void duplArray1 ()
	{
		//Find duplicate numbers from array
		int a [] = {2,5,2,3,2,6,56,4,4,7,8,15,19,74,4,12,15,15,7,7};
		System.out.println("Duplicate Numbers = ");
		int b [] = new int[a.length];
		b = a;
			
		for(int i = 0 ; i < a.length ; i++)
		{
			int k = 0;

			for(int j = 0 ; j < a.length ; j++)
			{
				if(b[i] == a[j])
				{
					k++;
					for(int m = i-1 ; m >= 0 ; m--)
					{
						if(b[i] == b[m])
						{
							k--;
						}
					}
				}
			}
			if(k > 1)
			{
				System.out.println(b[i]);
			}
		}
	}
	
	static void duplArray2 ()
	{
		//find duplicate numbers(work only if one duplicate is present)
		int a[] = {1,2,3,4,2,7,8,8,3};
				
		System.out.println("duplicate numbers = ");
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = i+1 ; j < a.length ; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[i]);
				}
			}
		}		
	}
	
	public static void main(String[] args) {
		duplArray1();
		duplArray2();
	}
}
