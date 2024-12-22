package day20;

class Base{
	
	void m1(String str) {
		System.out.println(str);
	}
	void m2(String s) {
		System.out.println(s);
	}
}

class SubClass extends Base{
	void m1(String str) {//overriding
		System.out.println(str+ "Child Class Method");
		
	}
	
	void m2(String s1, String s2) {//overloading
		System.out.println(s1+s2);
	}
}
public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		obj.m1("Sasidhar");//Overridden method in the child class
		obj.m2("Gandikota");//method from parent class 
	    obj.m2("SasidharGandikota");
	    //Overloading method in the child class
	}

}
