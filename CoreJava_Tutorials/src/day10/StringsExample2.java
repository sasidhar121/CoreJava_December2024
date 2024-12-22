package day10;

public class StringsExample2 {

	public static void main(String[] args) {
		
		
		//trim() - removing the spaces from both sides of the String 
		String str =   " Sasidhar  " ;
		System.out.println(str.length());
        
		System.out.println(str.trim());
		System.out.println(str);
		System.out.println(str.trim().length());
		
		//charAt() -- returns an specified index in the String 
		//starting index is 0
		String str1 = "JavaProgramming";
		System.out.println(str1.charAt(9));
	}

}
