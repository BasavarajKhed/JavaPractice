package com.pra;

public class Occurances {

	public static void main(String[] args) {
		String s1 = "axyzbcayesaqwea";

		int tl = s1.length();
		int rl = s1.replace("a", "").length();
		int occ = tl - rl;
		System.out.println(occ);
		
		
	}

}
