package day16;

public class AdditionMain {
   
	//Execution starts in the main method
	public static void main(String[] args) {
		
		Addition obj = new Addition(); //create obj object
     
		obj.sum();//1
		obj.sum(134.5, 34);//4 
		obj.sum(50, 124.7);//3
		obj.sum(40, 50);
		obj.sum(34, 45, 67);
	}

}
