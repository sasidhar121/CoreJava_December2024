package day15;

public class HelloMain {

	public static void main(String[] args) {
		
		Hello hello = new Hello();
		//calling method
		//invoking method
		//1)No Input params, No Return type
		hello.message1();
		
		
		//2)No Input params, No Return type
		int x = hello.message2();
		System.out.println(x);
		
		//3)Has Input params, No Return type
		// calling statements
		hello.message3("Swaroop");
		
		
		hello.message4("Welcome", 100);
		
		//4)Has Input params, Return type;
		String fullName = hello.message5("Sasidhar", "Gandikota");
        System.out.println(fullName);
	}

}
