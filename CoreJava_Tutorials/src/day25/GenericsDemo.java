package day25;

class Container<T> {
	T value;
	T id;
	T key;
}

public class GenericsDemo {

	public static void main(String[] args) {

		Container<Integer> object = new Container<>();
		object.value = 123;
		object.id = 101;
		object.key = 1000;

		Container<String> object1 = new Container<>();
		object1.value = "Sasidhar";
		object1.id = "Gandikota";
		object1.key = "Sasidhar Gandikota Academy";

	}

}
