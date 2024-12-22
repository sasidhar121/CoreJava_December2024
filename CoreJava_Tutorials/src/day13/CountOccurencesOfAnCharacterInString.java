package day13;

public class CountOccurencesOfAnCharacterInString {

	public static void main(String[] args) {
		
		String str = "Java Strings Example";
		
		int len = str.length(); //length of the String 
         int temp = str.replace("E", "").length();
         //all the a will replaced with empty
         
         int count = len - temp;//this will be the count of a occurrences
         System.out.println(count);
	}
	
	
	

}
