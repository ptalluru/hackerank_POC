package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

public class TwentySix {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int returnedDay = scan.nextInt();
		int returnedMonth = scan.nextInt();
		int returnedYear = scan.nextInt();
		int expectedDay = scan.nextInt();
		int expectedMonth = scan.nextInt();
		int expectedYear = scan.nextInt();
		scan.close();
		if ((returnedYear - expectedYear) != 0) {
			if(returnedYear<expectedYear)
				System.out.println(0);
			else
				System.out.println(10000);
		} else if ((returnedMonth - expectedMonth) != 0) {
			if(returnedMonth<expectedMonth)
				System.out.println(0);
			else
				System.out.println(500*(returnedMonth - expectedMonth));
		} else if ((returnedDay - expectedDay) != 0) {
			if(returnedDay<expectedDay)
				System.out.println(0);
			else
				System.out.println(15 * (returnedDay - expectedDay));
		}
	}
}