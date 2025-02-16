package day10;

public class test3 {
	

	    public static void main(String[] args) {
	        int[] arr = {5, 8, 9, 7, 3, 1};
	        
	        // Shift the array to the left by one position
	        int temp = arr[0];
	        for (int i = 1; i < arr.length; i++) 
	        {
	            arr[i - 1] = arr[i];
	        }
	        arr[arr.length - 1] = temp;
	        
	        // Print the updated array
	        System.out.print("{");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]);
	            if (i < arr.length - 1) {
	                System.out.print(",");
	            }
	        }
	        System.out.println("}");
	    }
	}



