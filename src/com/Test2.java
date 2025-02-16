package com;

public class Test2 {

	
	    public static void main(String[] args) {
	        int[] a = {5, 8, 9, 7, 3, 1};
	        
	        // Create a new array with the rearranged elements
	        int[] rearranged = new int[a.length];
	        
	        rearranged[0] = a[a.length - 1];  // Move the last element to the first position
	        
	        // Copy the remaining elements from index 0 to the second last position
	        System.arraycopy(a, 0, rearranged, 1, a.length - 1);
	        
	        // Print the rearranged array
	        for (int i = 0; i < rearranged.length; i++) {
	            System.out.print(rearranged[i] + " ");
	        }
	    }
	


}
