package day10;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse String without using inbuilt method reverse
		
		String str = "Sasidhar";//rahdisaS
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--){
			
		
				
			rev = rev + str.charAt(i);
				}
			System.out.println(rev);
		}
			

	}


