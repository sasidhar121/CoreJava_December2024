package day7;

public class NumberPatterns {

	public static void main(String[] args) {
		/*int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		1
		12
		123
		1234
		12345*/
	/*	int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		1
		22
		333
		4444
		55555*/
		/*int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		11111
		22222
		33333
		44444
		55555*/
		
	/*	int num=5;
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=num;j++) {
			System.out.print(j);
		}
		System.out.println("");
	}
	12345
	12345
	12345
	12345
	12345*/
		/*int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		11111
		22222
		33333
		44444
		55555*/
	
	
	int num=10;
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			
		if(i%2==0)//even number - it will print only once and break the loop 
		{
			System.out.print(i);
			break;
		}
		else
			System.out.print(i);
		}
		System.out.println("");
	}
	
}
}
	


