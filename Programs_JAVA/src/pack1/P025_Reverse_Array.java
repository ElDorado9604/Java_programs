package pack1;

public class P025_Reverse_Array {
	public static void main(String[] args) {
		//Reverse the Array - 2 Methods
		
		//1
		//Array a
		int a [] = {12,34,56,76,87,90};
		System.out.println("a :");
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i] + ",");
		}
		

		int b[] = new int[a.length];
		
	    for(int i = 0 ; i < a.length ; i++)
	    {
	    	b[i] = a[a.length-(1+i)];
	    }
		
	    a = b;
	    
	    System.out.println();
	    for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i] + ",");
		}
		
	 
	    System.out.println();
	    
	    
	    //2
	    //Array x
	    int x [] = {15,30,20,55,66,77};
	    System.out.println("x :");
	    for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print( x[i] + ",");
		}
	    
	    for(int i = 0 ; i < (a.length/2) ; i++)
	    {
	    	int c = x[i];
	    	x[i] = x[x.length-(1+i)];
	    	x[x.length-(1+i)] = c;
	    }
	    
	    System.out.println();
	    for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print( x[i] + ",");
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	
		
		
	}

}
