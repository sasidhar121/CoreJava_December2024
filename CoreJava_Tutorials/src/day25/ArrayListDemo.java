package day25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaration or creating object

		ArrayList arrList = new ArrayList();// Different data types

		// List list = new ArrayList();// Different data types

		// ArrayList<Integer> myList = new ArrayList<>(); // Only Integer values can be
		// stored
		List<Integer> myList = new ArrayList<>();
		// Adding the data into the ArrayList
		arrList.add(100);
		arrList.add("Sasidhar");
		arrList.add(234.567);
		arrList.add(true);
		arrList.add(100);
		arrList.add(null);
		arrList.add(100);
		arrList.add(null);
		arrList.add(500);
		// Size of the ArrayList
		int size = arrList.size();
		System.out.println(size);

		// Print the values in the ArrayList
		System.out.println(arrList);

		// Removing the elements - ArrayList
		arrList.remove(6);
		System.out.println(arrList);

		// Insert element at Specific index
		arrList.add(3, "SasidharGandikota");
		System.out.println(arrList);

		// modify element at Specific index
		arrList.set(4, "Test");
		System.out.println(arrList);

		// Retrieving the element at Specific index
		System.out.println(arrList.get(3));

		// Retrieve all elements from ArrayList with Index
		// Approach 1 - For loop
		/*
		 * for(int i=0;i<=arrList.size()-1;i++) { System.out.println(arrList.get(i)); }
		 */
		/*
		 * 2 - for each loop / Enhanced for loop for(Object x:arrList) {
		 * System.out.println(x); }
		 */
		// 3 - Using Iterator - Interface in Java collections
        Iterator it = arrList.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        //Checking ArrayList is Empty or not
        System.out.println(arrList.isEmpty());
        
        //Remove some elements from the ArrayList
        //[100, Sasidhar, 234.567, SasidharGandikota, true, 100, null, null, 500]
        ArrayList list2 = new ArrayList();
        list2.add("SasidharGandikota");
        list2.add(null);
        list2.add(500);
        
        arrList.removeAll(list2);
        System.out.println(arrList);
        
        //Remove all the Elements from the ArrayList 
        arrList.clear();
        System.out.println(arrList);
        System.out.println(arrList.isEmpty());
	}

}
