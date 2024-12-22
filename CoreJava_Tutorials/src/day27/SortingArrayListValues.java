package day27;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListValues {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>  arrList = new ArrayList<Integer>();
		
		arrList.add(20);
		arrList.add(5);
		arrList.add(50);
		arrList.add(25);
		arrList.add(100);
		
		System.out.println("Input Array List "+arrList);
		Collections.sort(arrList);
		System.out.println("Sorted Array List in Ascending Order "+arrList);
		
		Collections.sort(arrList, Collections.reverseOrder());
		System.out.println("Sorted Array List in Descending order "+arrList);
	}

}
