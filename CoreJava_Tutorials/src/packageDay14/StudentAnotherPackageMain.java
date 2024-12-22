package packageDay14;

import day14.Student;
//create Object of Student in Another package
public class StudentAnotherPackageMain {

	public static void main(String[] args) {
		
		Student stu = new Student();
        //Defined values - Instance variables
		stu.rollnum = 100;
		stu.name = "Bill Gates";
		stu.grade = 'A';
		stu.address = "India";
		//calling methods
		stu.displayAllvalues();
		stu.displayRollNum();
	}

}
