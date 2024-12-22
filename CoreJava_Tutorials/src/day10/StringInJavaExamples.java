package day10;

public class StringInJavaExamples {

	public static void main(String[] args) {
		//Approach 1 
		String str = "Swaroop";
		//Approach 2 
		String str1 = new String("Sasidhar");
      
		//inbuilt methods - String class
		//length() = return number of characters in the given String 
		
		int len = str.length();
		System.out.println(len);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println("Swaroop Nadella".length());
		
		int len2 = "SwaroopNadella".length();
		System.out.println(len2);
		
		//concat = concatenation + - it will join two Strings 
		String s1 = "Sasidhar";
		String s2 = "Gandikota";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
	    
		String s3 = "Academy";
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
	}

}
