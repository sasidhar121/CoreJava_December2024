package day23;

import java.util.Scanner;

public class HandlingExceptions {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("Start of the program");
			Scanner sc = new Scanner(System.in);
			// Example1 - Arthimetic Exception
			
			System.out.println("Enter an number:");
			int num = sc.nextInt();
			System.out.println(1000/num);

			
			sc.close();
			System.out.println("End of the Program");
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException catch block");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException catch block");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception catch block");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finally block statements");
	
		
		}
	}
}

