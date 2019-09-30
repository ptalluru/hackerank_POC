package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

	// Complete the countingValleys function below.
	/*
	 * A mountain is a sequence of consecutive steps above sea level, starting with
	 * a step up from sea level and ending with a step down to sea level.
	 * 
	 * A valley is a sequence of consecutive steps below sea level, starting with a
	 * step down from sea level and ending with a step up to sea level.
	 */
	static int countingValleys(int n, String s) {
		int valleyCount = 0;
		int level = 0;
		for (char item : s.toCharArray()) {
			if(item=='U') {
				level++;
			}
			if(item=='D') {
				level--;
			}
			if(level==0 && item=='U') {
				valleyCount++;
			}
		}
		return valleyCount;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of steps");
		int n = scanner.nextInt();
		System.out.println("Enter the sequences of uphill and downhill he stepped ");
		scanner.nextLine();
		String s = scanner.nextLine();
		int result = countingValleys(n, s);
		System.out.println("result:-"+ result);
		scanner.close();
	}
}
