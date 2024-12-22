package day10;

public class StringExample3 {

	public static void main(String[] args) {
		 //contains() -- returns boolean - true/false;
		//checks for the given String is part of the main String
		String s1="Sasidhar";//main String
		String s2="Sas";//part of the main String
		System.out.println(s1.contains(s2));
	
		
		//equals -- return boolean - true/false
		String str7 = "Swaroop";
		String str9 = "Swaroop1";
		System.out.println(str7.equals(str9));
	
	//equalsIgnoreCase -- compare Strings = It will ignore case-sensitive(upper or lower)
		String str3 = "swaroop";
		String str6 = "SWAROOP";
		System.out.println(str3.equalsIgnoreCase(str6));
	
		//contentEquals  -- compare Strings = It will return boolean - true/false - and checks if it is case-sensitive then it will be true or it will return false
		String s11 = "Sasidhar";
		String s12 = "sasiDhar";
		System.out.println(s11.contentEquals(s12));
	}
	
	
	

}
