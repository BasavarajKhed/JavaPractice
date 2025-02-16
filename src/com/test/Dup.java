package com.test;

public class Dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"Java","Python","Scala",".net","Java"};
		boolean status=false;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					status=true;
					System.out.println("Duplicate is Found "+a[i]);
				}
			}
		}
		if (status==false) {
			System.out.println("Not Dublicate");
		}
		
		

	}

}
