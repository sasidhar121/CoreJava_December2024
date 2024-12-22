package day9;

public class LinearSearchInArray {

	public static void main(String[] args) {
		int a[] = {10,22,9,44,67,49,57,11,56,99};
		int num =59;
		boolean status = false;
		//false = the number is not found in the array
		//true = the number is found in the array
		//normal for loop
		/*for(int i=0;i<a.length;i++) {
			if(a[i]==num) {//comparision
				System.out.println("Number is found in the Array");
				status =true;
				break;
			
			}
		if(status == false)
		System.out.println("Number is not found in the Array");	
		}
		*/
		//Enhanced for loop
		for (int x:a) {
			if(x==num) {//comparision
				System.out.println("Number is found in the Array");
				status =true;
				break;
			
		}
		}
		if(status == false)
		System.out.println("Number is not found in the Array");
	}

}

