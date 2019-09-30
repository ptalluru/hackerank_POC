package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class DivisbleSumPairs {

	// Complete the divisibleSumPairs function below.
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {//ar.length-1
			for (int j = i; j < ar.length - 1; j++) {
				if ((ar[i] + ar[j + 1]) % k == 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n = scanner.nextInt();
		System.out.println("Enter the k value");
		int k = scanner.nextInt();
		System.out.println("Enter the array elements");
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int arItem = scanner.nextInt();
			ar[i] = arItem;
		}
		int result = divisibleSumPairs(n, k, ar);
		System.out.println("result" + result);
		scanner.close();
	}
}
