package pack1;

import java.util.Arrays;

public class P027_Remove_duplicate_from_char_array {

	public static void main(String[] args) {
		//Remove duplicate from character array
		
		char a [] = {'a','n','a','e','f','s','f','r'};
		
		String _array = "";
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(_array.indexOf(a[i]) == -1)										//if character is not present in the string _array it returns -1.
			{
				_array = _array + a[i];
			}
		}
	
		char b[] = new char[_array.length()];
		for(int i = 0 ; i < _array.length() ; i++ )
		{
			b[i] = _array.charAt(i);
		}
		System.out.println(Arrays.toString(b));
		
	}
}
