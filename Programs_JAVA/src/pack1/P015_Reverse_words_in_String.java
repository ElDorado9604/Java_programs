package pack1;

public class P015_Reverse_words_in_String {
	public static void main(String[] args) {

		String Intro = "Hellov Ashish here";
		String [] b = Intro.split(" ");
	
		int index;
		for(index = 0 ; index < b.length ; index++)
		{
			String rev = "";
			for(int i = b[index].length()-1 ; i >=0 ; i--)
			{
				rev = rev + b[index].charAt(i);
			}
			b[index] =rev;	
		}
		
		String ans = "";
		for(int i = 0 ; i < b.length ; i++)
		{
			ans = ans + b[i] + " ";
		}
		System.out.println(ans);
		
		
		//OR
		
//		String Intro = "Hellov Ashish here";
//		String [] b = Intro.split(" ");
//		System.out.println(Intro);
//	
//		int index;
//		for(index = 0 ; index < b.length ; index++)
//		{
//			String rev = "";
//			for(int i = b[index].length()-1 ; i >=0 ; i--)
//			{
//				rev = rev + b[index].charAt(i);
//			}
//			b[index] =rev;
//			System.out.print(b[index].concat(" "));
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
