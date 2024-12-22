package day7;

public class Coding6 {

	public static void main(String[] args) {
		//counter number of digits in a number
		int num = 1231233;
		int count =0;
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
