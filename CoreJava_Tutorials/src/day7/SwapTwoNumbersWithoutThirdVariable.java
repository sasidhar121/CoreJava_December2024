package day7;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 34;
		int b = 56;
		/*int temp = a;
		a=b;
		b=temp;*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" + b);
		

	}

}
