package day5;

public class LargestNumber {

	public static void main(String[] args) {
		int a =1000,b=245,c=400;
		if(a>b && a>c) {
			System.out.println("a is the largest value");
		}
		else if (b>a && b>c) {
			System.out.println("b is the largest value");
		}
		else {
			System.out.println("c is the largest number");
		}
	}

}
