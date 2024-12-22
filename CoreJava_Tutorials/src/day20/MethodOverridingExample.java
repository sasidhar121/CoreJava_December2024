package day20;

//Hierarchy Inheritance
class Bank{//parent
	
	double interestRate() {
		return 5.5;
		
	}
	
}

class BOFA extends Bank {//child1 
	double interestRate() { //overriding 
		return 7.5;
		
	}
	
}

class JPM extends Bank{
	double interestRate() { //child 2 
		return 11.5;//Implementation or //Definition
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		
		
		BOFA obj1 = new BOFA();
		double d1 = obj1.interestRate();
		System.out.println(d1);
		
		JPM obj2 = new JPM();
		double d2 = obj2.interestRate();
		System.out.println(d2);
		}

	}


