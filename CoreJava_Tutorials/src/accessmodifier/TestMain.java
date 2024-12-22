package accessmodifier;

import day23.Test;

public class TestMain {

	public static void main(String[] args) {
		/*//TestClass object = new TestClass();
		//obj.b;//default variable not visible outside package
		//obj.method("Swaroop");//default method not visible outside the package
        TestMain object = new TestMain();
		int var8 = object.d;
		System.out.println(var8);
        object.method5("Sasidhar");
	}*/
		Test object = new Test();
		int var4 = object.d;
		System.out.println(var4);
		object.method5("Sasidhar", "Gandikota");

}
}
