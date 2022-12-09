package pack1;

public class P023_Occurrences_of_character_in_String {
	
	public static void main(String[] args) {
		//Occurrences of character in String
		
		//Way1
		String name = "Ashish Burge";
		
		int size = name.length();
		int count_replace = name.toLowerCase().replace("s","").length();
		
		int occurrences = size - count_replace;
		System.out.println(occurrences);
		
		//Way2
		String name2 = "Santosh shelke";
		
		int count = 0 ;
		for(int i = 0 ; i < name2.length() ; i++)
		{
			if(name2.charAt(i) == 's')
			{
				count++;
			}
		}
		System.out.println("Occurances of character = " + count);
		
	}
}
