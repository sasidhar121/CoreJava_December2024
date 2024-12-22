package day13;

public class CountWordsInAString {

	public static void main(String[] args) {
		  
		//String str = "Swaroop Nadella Academy";
		String str = "Java Program to Count no of Strings";
		int count =1; //Intialize with 1 
		for (int i=0;i<str.length();i++) {//iterate entire string
			
		
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
			count++;
		}
		
		
	}
		System.out.println(count);

}
}
