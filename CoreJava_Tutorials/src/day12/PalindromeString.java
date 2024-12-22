package day12;

public class PalindromeString {

	public static void main(String[] args) {
		String inputString = "ANOOP";
		System.out.println(inputString);
		String reversed = "";
		for(int i=inputString.length()-1;i>=0;i--) {
			reversed = reversed + inputString.charAt(i);
		}
		
		System.out.println(reversed);
		if(inputString.equals(reversed)) {
			System.out.println("Palindorme String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}
		}
		

	}



