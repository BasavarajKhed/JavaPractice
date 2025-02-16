package com.test;

public class TestOccurances {

	public static void main(String[] args) {
		/*
		 * String s = "abcxyzabcxyz"; int lenght = s.replace("a", "").length(); int
		 * totallength = s.length();
		 * 
		 * int occurance = totallength - lenght; System.out.println(occurance);
		 */
		
		
		
		String a[]= {"abc","xyz","abc","azx"};
		
		
		String t="abc";
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==t) {
				count++;
			}
		}
		
		System.out.println("Number Of Occurances of abc Pattern "+count);
		
	}

}
