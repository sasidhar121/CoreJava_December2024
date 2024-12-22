package day14;
//Main method is in another class in same Package
public class StudentMain {

	//main method - execution starting point
	public static void main(String[] args) {
		//object creation
		Student student1 = new Student();
		//define values for the variables
		student1.rollnum = 10;
		student1.name="Alex";
        student1.grade='D';
        student1.address = "United States";
        
        //call methods
        student1.displayAllvalues();
        student1.displayRollNum();
        
        
        Student student2 = new Student();
		//define values for the variables
		student2.rollnum = 20;
		student2.name="John";
        student2.grade='E';
        student2.address = "United Kingdom";
        
        //call methods
        student2.displayAllvalues();
        student2.displayRollNum();
		
	}

}
