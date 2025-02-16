package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Declaration
		ArrayList ar = new ArrayList();

//		List la = new ArrayList();
//		ArrayList<Integer> arr=new ArrayList<Integer>();
		ar.add(100);
		ar.add("Basavaraj");
		ar.add(27.67d);
		ar.add('T');
		ar.add(234.67f);
		ar.add(12346568901l);
		ar.add(null);
		ar.add(12346568901l);
		ar.add(null);
		System.out.println("Printing data from arraylist " + ar);
		// size of an array
		System.out.println("Size of an arraylist" + ar.size());

		System.out.println(ar.remove(5)); // 5 is index of element
		System.out.println("After removing Printing data from arraylist " + ar);

//		Insertion of element

		ar.add(5, "Basavaraj added");
		System.out.println("After Adding  Printing data from arraylist " + ar);

		// modify element in the arraylist(Modify/replace/change)
		ar.set(5, "Khed");
		System.out.println("After Setting  Printing data from arraylist " + ar);

//		Acces Specic element from arraylist

		System.out.println(ar.get(5));

		/*
		 * for(int i=0;i<=ar.size()-1;i++) { System.out.println(ar.get(i)); }
		 */
		/*
		 * for (Object x : ar) { System.out.println(x); }
		 */
		// Using Iterator

		Iterator it = ar.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

//		checking elements from arraylist
		System.out.println(ar.isEmpty());
		System.out.println("Before removing elements from the List" + ar);
//	Remove all the elements from the arraylist
		ArrayList ar2 = new ArrayList();
		ar2.add("Basavaraj");
		ar2.add(27.67);
		ar2.add(null);
		ar.removeAll(ar2);
		System.out.println("After removing elements from the List" + ar);
//remove all the elements

		ar.clear();
		System.out.println(ar.isEmpty());

	}

}
