package com.practice;

public class Arrays {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int s=300;
		boolean status=false;
//		for(int i=0;i<a.length;i++)
		for(int x:a){
			if(x==s) {
				System.out.println("Element found...");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("Element not found...");
		}
		
	}

}
