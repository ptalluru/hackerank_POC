package com.demo.cg.DemoNew.HackerRank;

import java.util.Scanner;

public class AppleAndOrange {

	// Complete the countApplesAndOranges function below.
	static void countApplesAndOranges(int start, int end, int appleTreeLocation, int orangeTreeLocation, int[] apples,
			int[] oranges) {
		int appleLocation = 0 ;
		int orangeLocation = 0;
		int appleCount = 0;
		int orangeCount = 0;
		for (int i : apples) {
			appleLocation=appleTreeLocation+i;
			if(appleLocation>=start && appleLocation<=end) {
				appleCount++;
			}
		} 
		for (int i : oranges) {
			orangeLocation=orangeTreeLocation+i;
			if(orangeLocation>=start && orangeLocation<=end) {
				orangeCount++;
			}
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] st = scanner.nextLine().split(" ");

		int startingPointHouse = Integer.parseInt(st[0]);

		int endingPointHouse = Integer.parseInt(st[1]);

		String[] ab = scanner.nextLine().split(" ");

		int appleTreeLocation = Integer.parseInt(ab[0]);

		int orangeTreeLocation = Integer.parseInt(ab[1]);

		String[] mn = scanner.nextLine().split(" ");

		int noOfApples = Integer.parseInt(mn[0]);

		int noOfOranges = Integer.parseInt(mn[1]);

		int[] apples = new int[noOfApples];

		String[] applesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < noOfApples; i++) {
			int applesItem = Integer.parseInt(applesItems[i]);
			apples[i] = applesItem;
		}

		int[] oranges = new int[noOfOranges];

		String[] orangesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < noOfOranges; i++) {
			int orangesItem = Integer.parseInt(orangesItems[i]);
			oranges[i] = orangesItem;
		}

		countApplesAndOranges(startingPointHouse, endingPointHouse, appleTreeLocation, orangeTreeLocation, apples,
				oranges);

		scanner.close();
	}
}
