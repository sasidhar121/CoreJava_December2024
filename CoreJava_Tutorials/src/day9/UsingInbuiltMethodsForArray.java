package day9;

import java.util.Arrays;

public class UsingInbuiltMethodsForArray {

	public static void main(String[] args) {
		//int arr[] = {20,30,40,50,03,56,73};//unsorted
		//char ch[] = {'A','R','C','Y'};
		//float f[]= {34.56f,45.78f,67.83f,24.68f};
		String s[]= {"Rita","Anil","Bhaskar","Edward"};
		System.out.println("Before Sorting :"+Arrays.toString(s));
        Arrays.sort(s);//Ascending order - lower to higher
        
        System.out.println("After Sorting :"+Arrays.toString(s));
	}

}
