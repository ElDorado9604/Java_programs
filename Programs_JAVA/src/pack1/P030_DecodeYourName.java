package pack1;

public class P030_DecodeYourName {

	public static void main(String[] args) {
		//DecodeYourName
		String name = "swa#p@6na&8li";
		
		int ascii = 0;
		String w = "";
		for(int i = 0 ; i < name.length() ; i++)
		{
			ascii = name.charAt(i);
			if((ascii >= 65 && ascii <= 90 ) || ascii >= 97 && ascii <= 122)
			{
				w = w + name.charAt(i);
			}
		}
		name = w;
		System.out.println("name = " + name);
		
	}
}
//65 to 90 = ASCII value of capital letters
//97 to 122 = ASCII value of small letters
