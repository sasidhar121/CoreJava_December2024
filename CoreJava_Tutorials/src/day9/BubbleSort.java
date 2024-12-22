package day9;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {23,45,78,36,26,90,58};//unsorted
		System.out.println("Before Sorting :"+Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<arr.length;i++) {//entire array values
			
			for(int j=i+1;j<arr.length;j++) {//all subsequent position for index i
				if(arr[j]>arr[i]) {//Ascending 
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
  
	
	System.out.println("After Sorting" +Arrays.toString(arr));
}
}
