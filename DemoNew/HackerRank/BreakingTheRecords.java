package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class BreakingTheRecords {

	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] scores) {
		/*
		 * Integer[] array = Arrays.stream(scores).boxed().toArray(Integer[]::new); //
		 * to unwrap the above // int[] unwrap =
		 * Arrays.stream(array).mapToInt(Integer::intValue).toArray().
		 * Collection<Integer> c = Arrays.asList(array); int minCount =
		 * Collections.frequency(c, Collections.min(c)); int maxCount =
		 * Collections.frequency(c,Collections.max(c)); int[] result =
		 * {minCount,maxCount};
		 */
		int max = 0;
		int min = 100000000;
		int minCount = 0;
		int maxCount = 0;
		for (int i = 0; i < scores.length; i++) {
			if (i == 0) {
				min = scores[0];
				max = scores[0];
			} else if (i != 0) {
				if (scores[i] > max) {
					max = scores[i];
					maxCount++;
				} else if (scores[i] < min) {
					min = scores[i];
					minCount++;
				}
			}
		}
		int[] result = { maxCount, minCount };
		return result;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of games");
		int n = scanner.nextInt();
		System.out.println("Enter the games score");
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
			scores[i] = scanner.nextInt();
		}

		int[] result = breakingRecords(scores);
		System.out.println("result : " + result);
		scanner.close();
	}
}
