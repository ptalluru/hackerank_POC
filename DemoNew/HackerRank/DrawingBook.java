package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DrawingBook {

	/*
	 * Complete the pageCount function below.
	 */
	static int pageCount(int n, int p) {
		int startCount = 0;
		int lastCount = 0;
		int last = 0;
		for (int start = 0; start <= n + 1;) {
			Integer[] arr = new Integer[2];
			arr[0] = start;
			arr[1] = start + 1;
			System.out.println(arr[0] + "  " + arr[1]);
			List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
			if (!list.contains(p)) {
				startCount++;
				start = start + 2;
			} else if (list.contains(p)) {
				break;
			}
		}

		if (n % 2 == 0) {
			last = n + 1;
		} else {
			last = n;
		}
		for (last = last; last > 0;) {
			Integer[] arr = new Integer[2];
			arr[0] = last;
			arr[1] = last - 1;
			System.out.println(arr[0] + " last " + arr[1]);
			List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
			if (!list.contains(p)) {
				lastCount++;
				last = last - 2;
			} else if (list.contains(p)) {
				break;
			}
		}
		System.out.println(startCount + "   " + lastCount);
		if (startCount < lastCount) {
			return startCount;
		} else {
			return lastCount;
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the book");
		int n = scanner.nextInt();
		System.out.println("Enter the page to find in the book");
		int p = scanner.nextInt();
		int result = pageCount(n, p);
		System.out.println(result);
		scanner.close();
	}
}
