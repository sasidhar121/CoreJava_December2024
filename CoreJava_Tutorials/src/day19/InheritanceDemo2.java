package day19;


//Multilevel  Inheritance 
class C{//Parent 
	int x =10;
	void display() {
		System.out.println(x);
	}
}

class D extends C{
	//child 1 
	int y =20;
	void print() {
		System.out.println(y);
	}
}

class E extends D{
	//child 2
	int z = 30;
	void present() {
		System.out.println(z);
	}
}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		/*
		D object = new D();//child 1 
		System.out.println(object.x);//parent
		object.display();
		System.out.println(object.y);//child1
		object.print();//child1
		*/
		E object2 = new E();//child 2 
		System.out.println(object2.x);//parent
		object2.display();//parent
		System.out.println(object2.y);//child 1 
		object2.print();//child 1 
		System.out.println(object2.z);//child 2 
		object2.present();//child 2 
	}

}
