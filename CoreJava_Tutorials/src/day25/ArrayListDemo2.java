package day25;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(200);
		System.out.println(list);
		System.out.println(list.get(2));
		
		//Using Iterator with Integer Generics
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
