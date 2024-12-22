package day10;

import java.util.Arrays;

public class StringExample6 {

	public static void main(String[] args) {
		//split - it will create multiple string based on delimiters 
	String str = "Swaroop Nadella Academy";
	String s[] = str.split(" ");
	System.out.println(Arrays.toString(s));
	System.out.println(s[0]);
	System.out.println(s[1]);
	
	String str2 = "test1235@gmail.com";
	String s2[] = str2.split("@");
	System.out.println(Arrays.toString(s2));
	
	String amount = "$1,23,456";
	String s4[] = amount.split(",");
	System.out.println(Arrays.toString(s4));
	System.out.println(s4[2]);
	
	}
	
	

}
