package day17;

public class ThisKeyword {
	
	//variables
	int x, y; //Instance variables - mapped to the object memory
	
	/*ThisKeyword(int x, int y){//Parameterized constructor
		// a and b are local variables
		this.x=x;
		this.y=y;
		
		//Initialize the variable values
	}
	*/
	
	
	
	//methods
	
	void setData(int x, int y) {   //User Defined method
		
		this.x=x;
		this.y=y;
		
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		
		ThisKeyword th = new ThisKeyword();
		th.setData(500,1000);
		th.display();

	}

}
