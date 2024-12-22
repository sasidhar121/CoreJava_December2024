package day20;


class ParentClass
{
	void display() {
		System.out.println("Parent dispay method");
	}
}


class ChildClass extends ParentClass{
	@Override
	void display() {//overriding
		System.out.println("Child display method");
	}
	
}

public class OverrrideAnnotation {

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		obj.display();
	}

}
