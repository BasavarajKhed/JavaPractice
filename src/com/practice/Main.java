package com.practice;
import java.util.ArrayList;

class Demo {
	/*
public void show()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("banana");
        list.add("apple");
        Collections.sort(list);
        Iterator itr = list.iterator();

       
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
} public class Main {
public static void main(String[] args)
    {
        Demo demo = new Demo();
        demo.show();
    }*/
	public void show()
    {
		ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        System.out.println(list.getClass());
        System.out.println(list1.getClass());
        boolean check = (list.getClass() == list1.getClass());
        System.out.println(check);
    }
} public class Main {
public static void main(String[] args)
    {
        Demo demo = new Demo();
        demo.show();
    }
	
	
}
