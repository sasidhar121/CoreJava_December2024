package day18;

public class MyClass {
	
   //static variable 
	static int counter = 0;
	
	//non static variable or instance variable
	
	int instanceNumber = 0;
   
	
    //Default Constructor 
	MyClass(){
		counter++;
		instanceNumber++;
	}
	//static method 
	static void displayCounter() {
		System.out.println("static variable counter : "+counter);
		
		//no need of Object for static members inside static method
		int c = MyClass.counter;
		display();
		//inside static method - calling non static members needs object creation
		MyClass obj = new MyClass();
		obj.displayInstanceNumber();
	}
	
	//static method
	static void display() {
		System.out.println("static display method");
	}
	

	
	void displayNonStatic() {
		System.out.println("Non static mehtod");
		int c = counter;
		displayCounter();
		int d = instanceNumber;
		displayInstanceNumber();
	}
	
	//non-static method - instance variable 
		void displayInstanceNumber() {
			System.out.println("instance variable: " +instanceNumber);
		}

	//execution point - jvm 
	public static void main(String[] args) {
		
		MyClass obj1 = new MyClass();//First object
		displayCounter();
		obj1.displayInstanceNumber();//non static method 
		MyClass obj2 = new MyClass();//Second object
		//accessing static members 
		displayCounter();
		obj2.displayInstanceNumber();
		
		

	}

}
