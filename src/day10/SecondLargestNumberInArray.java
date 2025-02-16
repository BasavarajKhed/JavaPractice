package day10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int a[]= {10,30,20,50,60};
		
		int max=a[0];
		
		Arrays.sort(a);
		for(int c:a) {
			System.out.println(a.length-1);
		}
		

		
//	int[] q=Arrays.stream(a).sorted().toArray();
//		
//	
//	
//		for(int i=0;i<q.length;i++)
//		{
//			System.out.println(q[q.length-2]);
//		}
//			

	}

}
