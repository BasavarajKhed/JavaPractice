package com.practice;

public class Test6 {

	public static void main(String[] args) {
	
		
		 int[] arr = {5, 8, 9, 7, 3, 1};
	        
	        // Find the smallest element and move it to the front
	        int minIndex = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < minIndex) {
	                minIndex = i;
	            }
	        }

	        int temp = arr[minIndex];
	        arr[minIndex] = arr[0];
	        arr[0] = temp;
	        
	        
//	        System.out.print("{");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]);
	            if (i < arr.length - 1) {
	                System.out.print(",");
	            }
	        }
//	        System.out.println("}");
	        
	        
	        
	}

}
