package day16;

public class Addition {
	
	//variables
	int a,b;
	
	//methods
	void sum() { //Case1 - No inputs
		a=100;
		b=200;
		
		System.out.println(a+b);
	}
    void sum(int x, int y) {//case2 - two inputs 
    	System.out.println(x+y);
    }
    
    void sum(int x , double y) {//case 3 - two inputs - different datatypes
    	System.out.println(x+y);
    }
    
    
    
    void sum(double x , int y) {
    	//Case 4 - two inputs - order of data types is changed
    	System.out.println(x+y);
    }
    
    void sum(int x, int y, int z){
    	//Case 5 - three inputs
    	System.out.println(x+y+z);
    }
}
