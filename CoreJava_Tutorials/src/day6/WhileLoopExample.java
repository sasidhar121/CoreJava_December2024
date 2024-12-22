package day6;

public class WhileLoopExample {

	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		//Print Java message for 10 times 
		int j=1;
		while(j<=10) {
			System.out.println("Java");
			j++;
		}
		
		//Example3: Printing Odd numbers from 1 to 10
		
		int k =1;
		while(k<=10) {
			if(k%2==1){
				System.out.println(k);
			}
			k++;
		}
		
		
		//Example 4 : Printing Even numbers from 1 to 10 
		int h = 1;
		while(h<=10) {
			if(h%2==0) {
				System.out.println(h);
			}
			h++;
		}
	//Example 5 : Print both odd and even 
		int a =1;
		while(a<=10) {
			if(a%2==1) {
				System.out.println("Odd Number :"+a);
			}
			else {
				System.out.println("Even Number :" +a);
			}
			a++;
		}
		//Example 6:Only Print odd
		int f = 1;
		while(f<=10) {
			if(f%2==1) {
				System.out.println("Odd Numbers:"+f);
			}
			f=f+2;
		}
		
		
		int g = 1;
		while(g<=10) {
			System.out.println(g);
			g+=2;
		}
		int m = 2;
		while(m<=10) {
			System.out.println(m);
			m+=2;
		}

	}

}



