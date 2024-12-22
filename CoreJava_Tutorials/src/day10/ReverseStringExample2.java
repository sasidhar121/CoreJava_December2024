package day10;

public class ReverseStringExample2 {

	public static void main(String[] args) {
		
		        // Given string
		        String str = "Anil kumar";
		        
		        // Split the string into words
		        String[] words = str.split(" ");
		        
		        // Reverse the order of the words
		       String result = "";
		        
		       for (int i = words.length- 1; i >= 0; i--) {
		            result += words[i];  // Add the word to the result string
		            if (i != 0) {
		                result += " ";  // Add space between words except for the last word
		            }
		        }
		        
		        // Output the reversed string
		        System.out.println(result);
		        System.out.println(words.length);
		    }
		}
