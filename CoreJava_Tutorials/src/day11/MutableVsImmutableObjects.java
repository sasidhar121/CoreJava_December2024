package day11;

import java.util.Arrays;

public class MutableVsImmutableObjects {

	public static void main(String[] args) {
		//Mutable - we can change the value in the memory
		int arr[] = {11,22,48,10,9,4,5,90};
		System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); //sorting in the memory
        System.out.println(Arrays.toString(arr));
        
        //immutable - we cannot change the value in the memory
        String s= new String("Welcome");
        System.out.println(s);
        s.concat("to Java");
        System.out.println(s);
        
        //mutable - we can change the value in the memory 
       StringBuffer str4 = new StringBuffer("Hi" );
       System.out.println(str4);
       str4.append("How are you");
       System.out.println(str4);
       //mutable - we can change the value in the memory 
       StringBuilder str7 = new StringBuilder("Sasidhar" );
       System.out.println(str4);
       str7.append("Gandikota");
       System.out.println(str7);
       
        
	}

}
