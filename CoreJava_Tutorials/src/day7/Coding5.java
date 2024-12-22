package day7;

public class Coding5 {

	public static void main(String[] args) {
		int num =1221;
		int temp = num;
		int remainder = 0;
		int reverse=0;
		while(num>0) {
			remainder = num%10;
			reverse = reverse*10 + remainder;
			num=num/10;
			
		}
		System.out.println(reverse);
		if(temp==reverse) {
			System.out.println("It is a Palindrome number");
		}
		else {
			System.out.println("It is not a Palindrome number");
		}
		

	}

}
