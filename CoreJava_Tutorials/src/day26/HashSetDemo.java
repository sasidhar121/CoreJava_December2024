package day26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		// Declaration
		HashSet hs = new HashSet();
		// Set mySet = new HashSet();
		// HashSet<Integer> set = new HashSet<>();

		// Adding Elements into the HashSet
		hs.add(100);
		hs.add("Sasidhar");
		hs.add(true);
		hs.add(231.99);
		hs.add(null);
		hs.add(100);
		hs.add(200);
		hs.add(null);
		hs.add("Sasidhar");
		System.out.println(hs);

		// Remove element from the hashSet
		hs.remove(100); // pass the value to remove it
		System.out.println(hs);

		// Insert in the Middle of the HashSet
		// Not possible to insert elements in between

		// Retrieve specific element using index
		// Not possible to retrieve specific index

		// Converting Hashset into ArrayList

		ArrayList list = new ArrayList(hs);
		System.out.println(list.get(3));

		// Retrieve All the elements from the HashSet
		// Normal for loop not possible as no index

		// Enhanced for loop - for each
		for (Object x : hs) {
			System.out.println(x);
		}

		// Using Iterator
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// clear all the elements
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
	}
}
