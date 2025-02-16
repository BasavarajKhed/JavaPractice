package com.pra;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,4,3,6,7,8,10};
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
