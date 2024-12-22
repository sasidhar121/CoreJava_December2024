package day8;

import java.util.Arrays;

public class ArrayInbuiltMethodPrograms {

	public static void main(String[] args) {
		int arr[] = {12,10,34,556};//first array
		int rev[] = new int[arr.length];//reverse array
        int index =0;
        for(int i=arr.length-1;i>=0;i--) {
        	rev[index]=arr[i];
        	index++;
        	
        }
      /*  for(int x=0;x<rev.length;x++) {
        	System.out.println(rev[x]);
        
        }
        */
      System.out.println("Input Array : "+Arrays.toString(arr));
        System.out.println("Output Array :"+Arrays.toString(rev));
        
        
        Arrays.sort(arr);//sort the values in memory for arr array
        System.out.println("Sorted Array: "+Arrays.toString(arr));
	}
        


	}


