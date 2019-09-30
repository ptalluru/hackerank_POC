package com.demo.cg.DemoNew.HackerRank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	// Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;
        double arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        DecimalFormat numberFormat = new DecimalFormat("0.000000");
        double positiveFraction = positiveCount / arrayLength;
        double negativeFraction = negativeCount / arrayLength;
        double zeroFraction = zeroCount / arrayLength;
        System.out.println(numberFormat.format(positiveFraction));
        System.out.println(numberFormat.format(negativeFraction));
        System.out.println(numberFormat.format(zeroFraction));
    }

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
