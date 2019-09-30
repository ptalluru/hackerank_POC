package com.demo.cg.DemoNew.HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	Arrays.sort(arr);
    	long min = arr[0];
    	long max = arr[arr.length-1];
    	long totalSum = 0;
    	for(int i = 0;i<arr.length;i++) {
    		totalSum = totalSum+arr[i];
    	}
    	long minSum = totalSum-max;
    	long maxSum = totalSum-min;
    	System.out.println(minSum+" "+maxSum);
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

		/*
		 * String[] arrItems = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 */
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        miniMaxSum(arr);
        //scanner.close();
    }
}
