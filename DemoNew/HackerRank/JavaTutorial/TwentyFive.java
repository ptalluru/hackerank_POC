package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

public class TwentyFive {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i : arr) {
			if (i == 1 || (i % 2 == 0 && i > 2)) {
				System.out.println("Not prime");
				continue;
			}
			if (i == 2) {
				System.out.println("Prime");
				continue;
			}
			for (int j = 2; j <= (int)Math.sqrt(i); j++) {
				if (i % j == 0) {
					System.out.println("Not prime");
					break;
				} else if ((j + 1)  > (int)Math.sqrt(i)) {
					System.out.println("Prime");
				}
			}
		}
	}
}