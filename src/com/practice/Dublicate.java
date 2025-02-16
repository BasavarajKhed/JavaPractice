package com.practice;

public class Dublicate {

	public static void main(String[] args) {
		

		String a[] = { "test", "java", "Tet", "java" };
		
		boolean status = false;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Found " +a[i]);
					status = true;
				}
			}

		}
		if (status == false) {
			System.out.println("NF");
		}
	}

}
