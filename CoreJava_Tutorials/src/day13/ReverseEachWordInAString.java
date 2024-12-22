package day13;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		
		String str = "Swaroop Nadella Academy";
		System.out.println(str);
		String words[] = str.split(" ");
		//output String : poorawS alledaN ymedscA
		String rev = "";
		for(String w:words) {
			//Enhanced For loop for Array navigation 
			
		String reverseWord = "";
		for(int i=w.length()-1;i>=0;i--) {
			
			reverseWord = reverseWord+w.charAt(i);
		}
		rev = rev + reverseWord + " ";
		}
		System.out.println(rev);
	}
	

}
