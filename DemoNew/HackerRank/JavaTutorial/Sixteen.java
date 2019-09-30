package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

public class Sixteen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		try {
			System.out.println(Integer.parseInt(S));
		} catch (NumberFormatException nfe) {
			System.err.println("Bad String");
		}
	}
}