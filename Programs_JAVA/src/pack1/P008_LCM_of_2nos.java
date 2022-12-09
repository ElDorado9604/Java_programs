package pack1;

public class P008_LCM_of_2nos {

	public static void main(String[] args) {
		//LCM
				int a =12;
				int b =66;
				int remain = 1 ; //you can assign any value to this variable but other than zero.
				
				if(a == 0 || b == 0)
				{
					System.out.println("Invalid Input. Please correct your numbers.");
				}
				else
				{
					for(int i =1 ; remain != 0 ; i++)  // you can put any condition. I started this program from this line then I made some changes.
					{
						int c = a * i;
						remain = c % b; //Here new value to the variable remain will be assigned.
						
						//System.out.println(i);
						//System.out.println(remain);
						
						if(remain == 0)
						{
							System.out.println("LCM of " + a + " and " + b + " = " + a * i);
						}
					}
				}
			
			
				
				

	}

}
