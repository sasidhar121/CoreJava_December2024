package day23;

public class Test {
	public int d =400;
	public void method5(String str1, String str2) {
		System.out.println(str1+str2);
	}

	public static void main(String[] args) {
		Test object =  new Test() ;
			System.out.println(object.d);
			object.method5("Sasidhar", "Gandikota");
		}
		
		//obj.method();
		//obj.a;//private method not visible outside class 

	}


