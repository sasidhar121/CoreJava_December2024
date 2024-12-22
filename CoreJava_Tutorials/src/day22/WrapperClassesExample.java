package day22;

public class WrapperClassesExample {

	public static void main(String[] args) {
		
		//Case1: Convert String to other data types 
		
		//String str = "swaroop"; //Invalid input for Number
		String str = "12345";
		int x = Integer.parseInt(str);
		System.out.println(x);
		
		
		String str1 = "5555.345";//double value in the String 
		String str2 = "23434.53";
		System.out.println(str1+str2);//concatenation
		double d1 = Double.parseDouble(str1);
		double d2 = Double.parseDouble(str2);
		System.out.println(d1+d2);
		
		//String str3 = "true";//returns true when it is true 
		String str4 = "sasidhar";
		//return false in all other cases except true 
		
		
		Boolean b = Boolean.parseBoolean(str4);
		System.out.println(b);
		
		//String to char - multiple characters to single char is not possible 
		//character.parseCharacter --not available
	}

}
