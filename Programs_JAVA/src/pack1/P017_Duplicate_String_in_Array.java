package pack1;

public class P017_Duplicate_String_in_Array {
	public static void main(String[] args) {
		//find duplicate String(work only if one duplicate is present)

		String str [] = {"Ashish","Santosh","Mahesh","Ashish",
						"Swaraj","Akshay","Anup","Santosh",
							"Shree"};
		
		System.out.println("duplicate strings = ");
		for(int i = 0 ; i < str.length ; i++)
		{
			for(int j = i+1 ; j < str.length ; j++)
			{
				if(str[i] == str[j])
				{	
					System.out.println(str[i]);
				}
			}
		}
	}
}
