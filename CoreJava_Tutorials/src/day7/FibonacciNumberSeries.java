package day7;

public class FibonacciNumberSeries {

	public static void main(String[] args) {
		int n1=0 ,n2=1;
		int n3=0;
		System.out.print(n1);
		System.out.print(n2);
		int count=30;
		for(int i=3;i<=count;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
