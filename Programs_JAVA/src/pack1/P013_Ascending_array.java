package pack1;

import java.util.Arrays;

public class P013_Ascending_array {

	public static void main(String[] args) {
		//Ascending & Descending Array
		
		int a[] = {4,6,5,1,28,62,23,3,17};
		
		for(int k = 1 ; k < a.length ; k++)
		{
			for(int i = 0 ; i < a.length-k; i++)
			{
				if(a[i] > a[i+1]) // a[i] < a[i+1]  - for descending
				{
					int c = a[i];
					a[i] = a[i+1];
					a[i+1] = c;
				}
			}
		}
		
		for(int j = 0 ; j < a.length ; j++)
		{
			System.out.print(a[j] + ",");
		}
	}
}
