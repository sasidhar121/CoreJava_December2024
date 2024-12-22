package day8;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		//1 D Array
		//Approach 1
		int a[] = new int[5];//Declaration and should specify the lenght of array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=50;
		a[4]=70;
		
		int length = a.length;
		System.out.println(length);
		
		
		//Normal for loop 
		/*for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}*/
		
		//Enhanced for loop - For each loop
		for(int x:a) { //more efficient code
			System.out.println(x);
		}
		
		//Approach 2 
		//int b[] = {20,30,40,50,60,59,60,48};//declaring and assigning values
     // System.out.println(b.length);
		
		
	}

}
