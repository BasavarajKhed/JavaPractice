package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
//		Set hs = new HashSet();
//		HashSet<String> hs=new HashSet();
// Adding elements into hashset
		hs.add("Basavaraj");
		hs.add(100);
		hs.add("Test");
		hs.add(null);
		hs.add(null);
		hs.add(1890769l);
		hs.add(19.79);
		hs.add(100);
		System.out.println(hs.size());
		System.out.println(hs);
		

		hs.remove("Test");

		System.out.println("After remove " + hs);

//		Insertion is not possible
//		Not able to Access specing element

//		Convert hashset to arraylist

		/*
		 * ArrayList ar=new ArrayList(hs); System.out.println(ar);
		 * System.out.println(ar.get(0));
		 */
		// Read all the elements from the loop
		/*
		 * for (Object x : hs) { System.out.println(x); }
		 */
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
//		Clearing all the values from list
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
	}

}
