package day4;

public class IncrementOperator {

	public static void main(String[] args) {
		int a = 100;
		a++;//a=a+1
		System.out.println(a);
		++a;
		System.out.println(a);
		a--;
		System.out.println(a);
		--a;
		System.out.println(a);
		int b =200;
		int result = b++;//Post Increment Operation
		System.out.println(result);
		System.out.println(b);
		int c = 400;
		int result2= ++c;//Pre Increment Operation
		System.out.println(result2);
		System.out.println(c);
		
        
	}

}
