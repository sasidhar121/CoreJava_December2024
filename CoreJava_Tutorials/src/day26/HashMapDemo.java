package day26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		// Declaration
		// HashMap hm = new HashMap();
		// Map m = new HashMap();
		HashMap<Integer, String> map = new HashMap<>();

		// Adding values into the HashMap - Key, Value pairs

		map.put(101, "Krishna");
		map.put(102, "Ram");
		map.put(103, "Kumar");
		map.put(104, "Sasidhar");
		System.out.println(map);

		map.put(101, "Gandikota");
		System.out.println(map);

		// size of the HashMap
		System.out.println(map.size());

		// Remove one key value pair
		map.remove(104);
		System.out.println(map);

		// Retrieve value of an Given Key
		System.out.println(map.get(102));

		// Retrieve all the keys and values from the HashMap
		System.out.println(map.keySet());//all keys
		System.out.println(map.values());//all values
		System.out.println(map.entrySet());//Both Key and values
		
		//Retrieving data from the Hash Map
		//Using for each loop 
		/*for(Integer k:map.keySet()) {
			System.out.println(k +" "+map.get(k));
		}*/
		
		//using Iterator 
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
        while(it.hasNext()) {
        	Entry<Integer,String> entry = it.next();
        	System.out.println(entry.getKey()+"  "+entry.getValue());
        	
        }
        
        //Clear all the values in the HashMap
        map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());
	}

}
