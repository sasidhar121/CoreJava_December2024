package day23;

import java.util.Scanner;

public class ExceptionsExample {

	public static void main(String[] args) {

		System.out.println("Start of the program");
		Scanner sc = new Scanner(System.in);
		// Example1 - Arthimetic Exception
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number:");
		int num = sc.nextInt();
		
		System.out.println(1000/num);*/
		
		//Example2 
		/*int arr[] = new int[5];
		System.out.println("Enter an position(0-4):");
		int position = sc.nextInt();
		
		System.out.println("Enter an value:");
		int value = sc.nextInt();
		
		arr[position] = value;
		System.out.println(arr[position]);
		
		System.out.println("End of the Program");*/
		
		//Example 3 
		/*String str = "12345";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		System.out.println("End of the Program");*/
		
		//Example4 
		String s = null;
		System.out.println(s.length());

		System.out.println("End of the program");
	}

}
