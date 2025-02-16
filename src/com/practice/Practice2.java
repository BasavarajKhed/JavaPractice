package com.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Practice2 {

	public static void main(String[] args) {
		/* PriorityQueue<Integer> queue
         = new PriorityQueue<>();
     queue.add(11);
     queue.add(10);
     queue.add(22);
     queue.add(5);
     queue.add(12);
     queue.add(2);

     while (queue.isEmpty() == false)
         System.out.printf("%d ", queue.remove());

     System.out.println("\n");
     */
		
		
/*
        TreeSet<String> treeSet = new TreeSet<>();
 
        treeSet.add("Geeks");
        treeSet.add("For");
        treeSet.add("Geeks");
        treeSet.add("GeeksforGeeks");
 
        for (String temp : treeSet)
            System.out.printf(temp + " ");
 
        System.out.println("\n");
     */
		
		
		
		/* HashSet<String> hashSet = new HashSet<>();
	        hashSet.add("Geeks");
	        hashSet.add("For");
	        hashSet.add("Geeks");
	        hashSet.add("GeeksforGeeks");
	 
	        System.out.println(hashSet);
     */
		
		 List<String> list = new LinkedList<>();
	        list.add("Geeks");
	        list.add("For");
	        list.add("Geeks");
	        list.add("GeeksforGeeks");
	        Iterator<String> iter = list.iterator();
	 
	        while (iter.hasNext())
	            System.out.printf(iter.next() + " ");
	 
	        System.out.println();
		
		
     
 }

	}


