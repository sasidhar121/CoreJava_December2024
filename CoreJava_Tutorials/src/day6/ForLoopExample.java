package day6;

public class ForLoopExample {

	public static void main(String[] args) {
		//for loop example - Print value from 1 to 10 
		/*for(int i =1;i<=10;i++) {
			System.out.println(i);
		}*/
		
		//For loop example to print numbers from 10 to 1 
		/*for (int i = 10; i>=0;i--) {
			System.out.println(i);
		}*/
		
		//Odd Numbers
		for(int i =1;i<=10;i+=2) {
			System.out.println(i);
			
			
		}
		System.out.println("-----------");
		//Even Numbers
	for (int j =2;j<=10;j+=2) {
		
System.out.println(j);
	}
	
	for (int k = 1;k<=10;k++) {
		if(k%2==1) {
			System.out.println(k + "Odd");
		}
		else {
			System.out.println(k + "Even");
		}
	}
	}
}


