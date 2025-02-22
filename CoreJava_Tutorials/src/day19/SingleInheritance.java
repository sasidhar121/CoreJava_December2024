package day19;

class Base{
//Parent


int x = 100;
int y = 200;

void display() {
	System.out.println("Display method in parent class");
}

}


class SubClass extends Base{
	//child
	int a = 50;
	int b = 60;
	void print() {
		System.out.println("Print method in child class");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		SubClass obj = new SubClass(); //child class object
		
		int var1 = obj.x; //Parent class variable
		System.out.println(var1);
	    int var2 = obj.y;// Parent class variable 
	    System.out.println(var2);
	    
	    obj.display(); // Parent class method 
        
	    
	   int var3 = obj.a;//Child class variable 
	   System.out.println(var3);
	   int var4 = obj.b;//child class variable 
	   System.out.println(var4);
	   
	   obj.print();//child class method
	}

}
