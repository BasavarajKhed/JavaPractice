package com.practice;

public class OccurancesOfCharacter {

	public static void main(String[] args) {
		String s="abjdnbhbhs";
		int toatalen=s.length();
		int totala=s.replace("a","").length();
		int totalb=s.replace("b","").length();
		int totalh=s.replace("h","").length();
		int count1=(toatalen-totala);
		int count2=(toatalen-totalb);
		int count3=(toatalen-totalh);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		
		
		
	}

}
