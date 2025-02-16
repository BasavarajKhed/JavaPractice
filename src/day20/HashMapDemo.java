package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
//		Declaration
//		HashMap hm=new HashMap();

//		Map hm=new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

//		Adding pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Basavaraj");
		hm.put(104, "Deepa");
		hm.put(105, "David");
		hm.put(105, "David");
		hm.put(102, "Dinesh");

		System.out.println(hm);
		System.out.println("Size of an hashmap:" + hm.size());

		hm.remove(101);
		System.out.println("After Removing key" + hm);

		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());

		// Reading data from hash map
//		Using for each

		/*
		 * for(int k: hm.keySet()) { System.out.println(k+"  "+hm.get(k));
		 * 
		 * }
		 */

//		Using Iterator
//		Iterator<Integer,String>it=
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();

		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + "   " + entry.getValue());

		}
		hm.clear();
		System.out.println(hm);
		System.out.println(hm.isEmpty());
	}

}
