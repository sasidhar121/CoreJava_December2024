package day16;

public class OverloadMain {
	
	void main() {//No inputs
		System.out.println("No Inputs");
	}
	
	void main(String str) {
		//one String input
		System.out.println("String data type input: "+str);
		
		
		
	}
	
	void main(int x) {
		//one int data type input
		System.out.println("int data type input: "+x);
	}
	
	void main(int x, int y){
		//two inputs
		
		System.out.println("X value is: " +x+  " Y value is: "+ y);
	}
//executing starting point
	public static void main(String[] args) {
		
		OverloadMain obj = new OverloadMain();
		obj.main();//no inputs
		obj.main(100);//int data type as input
		obj.main("Swaroop");// String data type as input
		obj.main(45, 56);// two inputs data type as input
		
		
	}

}
