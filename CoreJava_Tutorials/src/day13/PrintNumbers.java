package day13;

public class PrintNumbers {

	public static void main(String[] args) {
		
		//Print numbers from 1 to 100
		//we should not use any numbers in the program
		
		// First way
		int one = 'A'/'A';//1
		String str = "qqqqqqqqqq";
		int len = str.length();//10
		System.out.println("First Way");
		for(int i=one;i<=len*len;i++)
		{
			System.out.println(i);
		}
		
		//Second way
		System.out.println("Second Way");
		for(int i=one;i<='d';i++) {
			System.out.println(i);
			
		}
		
		//Third way
		System.out.println("Third way");
		String str1 = "programmin"; //10
		int zero = str1.length() - str.length();//0
		int hundred = str1.length()*str1.length();//100
		
		for(int i=zero;i<hundred;i++) {
			System.out.println(i+1);
			
		}
		
	}

}
