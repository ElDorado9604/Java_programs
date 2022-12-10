package pack1;

public class P024_Largest_Number_from_array {
	
	public static void main(String[] args) {
		//Largest Number from array
		
		int a [] = {23,48,56,43,57,52,2,81,17,33,44,78};
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			if(a[i] > a [i+1])	//a[i] < a[i+1] we get smallest number from array
			{
				int c = a[i];
				a[i] = a[i+1];
				a[i+1] = c;
			}
		}
		System.out.println("Largest Number = "+a[a.length-1]);
	}
}
