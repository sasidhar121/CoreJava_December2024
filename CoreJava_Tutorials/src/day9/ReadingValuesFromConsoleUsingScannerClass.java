package day9;

import java.util.Scanner;

public class ReadingValuesFromConsoleUsingScannerClass {

	public static void main(String[] args) {
		//int num=20//Hardcoding
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a number :");
		//int a = sc.nextInt();
		//System.out.println(a+11);
        //double d =sc.nextDouble();
        //System.out.println(d+10);
        System.out.println("Enter a City :");
        String city = sc.next();
        System.out.println("City is :" +city);
        
        System.out.println("Enter a char value: ");
        String ch = sc.next();
        System.out.println(ch);
        
	}

}
