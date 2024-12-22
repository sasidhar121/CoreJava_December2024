package day12;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		
		String str1 = "Listenw";
		String str2 = "Slientj";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//check the length
		
		if(str1.length() == str2.length()) {
			//convert Strings to Char Arrays
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			
			//Sort the both Arrays 
			Arrays.sort(charArray1); //sorting will happen in memory 
			Arrays.sort(charArray2);
			
			boolean result = Arrays.equals(charArray1, charArray2);
		
			if(result) {
				System.out.println("Lengths are matching");
				System.out.println(str1+" and "+str2+" are Anagram");
			}
				else {
					System.out.println("Lengths are not matching");
					System.out.println(str1+" and  "+str2+" are Not Anagram");
					
				}
			}
		
		else {
			
			System.out.println(str1+" and  "+str2+" are Not Anagram");
			
		}

	}

}

