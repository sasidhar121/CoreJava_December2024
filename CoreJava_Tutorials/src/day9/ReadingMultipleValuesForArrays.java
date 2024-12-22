package day9;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingMultipleValuesForArrays {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		
        for(int i=0;i<=a.length-1;i++) {
        	System.out.println("Enter a number :");
        	
        	a[i] = sc.nextInt();
        }
      System.out.println("Array value:"+Arrays.toString(a));  
	}

}
