package day14;

public class Student {
	
	//variables 
	public int rollnum;
	public String name;
	public char grade;
	public String address;
	
	
	//methods
	public void  displayAllvalues(){
		
		int rollnum = 35; //local variables
		System.out.println(rollnum);
		System.out.println(name);
		System.out.println(grade);
		System.out.println(address);
		
		
	}
	public void displayRollNum() {
		System.out.println("RollNum value is : "+rollnum);
	}
	
	
	
	//methods
	
	
	
    //method - main method is the execution starting point
	/*public static void main(String[] args) {
	    //creating an object
		Student stu1 = new Student();
		
		//assigned some values in the run time
		stu1.rollnum = 1;
		stu1.name = "Swaroop";
		stu1.grade = 'A';
		stu1.address = "Hyderabad";
		
		//call methods
		stu1.displayAllvalues();
		stu1.displayRollNum();
		
		Student stu2 = new Student();
		stu2.rollnum = 2;
		stu2.name = "Ravi";
		stu2.grade = 'B';
		stu2.address = "India";
		
		//call methods
		stu2.displayAllvalues();
		stu2.displayRollNum();
		
		Student stu3 = new Student();
		
		

	}
	*/

}
