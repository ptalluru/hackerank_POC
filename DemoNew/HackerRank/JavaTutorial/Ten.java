package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ten {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int remainder = 0;
		List<Integer> remainderList = new LinkedList<Integer>();
		List<Integer> countList = new LinkedList<Integer>();
		while (n > 0) {
			remainder = n % 2;
			remainderList.add(remainder);
			n = n / 2;
		}
		Collections.reverse(remainderList);
		System.out.println(remainderList);
		int oneCount = 0;
		int preInt = 1;
		int iterationCount = 0;
		for (Integer integer : remainderList) {
			if (integer == preInt) {
				oneCount++;
				if(iterationCount==remainderList.size()-1) {
					countList.add(oneCount);
				}
				iterationCount++;
				preInt = integer;

			} else if (integer != preInt) {
				countList.add(oneCount);
				iterationCount++;
				oneCount = 0;
			}
		}
		int max = Collections.max(countList);
		System.out.println(max);
		scanner.close();
	}
}
