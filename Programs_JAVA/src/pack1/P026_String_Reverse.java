package pack1;

public class P026_String_Reverse {
	public static void main(String[] args) {
		//String Reverse Program
		
		String FullName = "Ashish Burge";
		
		System.out.println(FullName);
		
		//Reverse Logic
		String r = "";
		for(int i = FullName.length()-1 ; i >= 0 ; i--)
		{
			r = r + FullName.charAt(i);
		}
		FullName = r ;
		
		System.out.println(FullName);
	
	}
}
