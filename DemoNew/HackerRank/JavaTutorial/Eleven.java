package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				int arrItem = scanner.nextInt();
				arr[i][j] = arrItem;
			}
		}
		int finalSum = -55;
		int rows = 0;
		int cols = 0;
		for (rows = 0; rows < (6 - 2); rows++) {
			for (cols = 0; cols < (6 - 2); cols++) {
				int maxSum = hourGlassSum(arr, rows, rows + 2, cols, cols + 2);//array,row start,row end,col start, col end
				if (maxSum > finalSum) {
					finalSum = maxSum;
				}
			}
		}
		scanner.close();
	}

	private static int hourGlassSum(int[][] arr, int rows, int i, int cols, int j) {
		int sum = 0;
		for (int rows1 = rows; rows1 <= i; rows1++) {
			for (int cols1 = cols; cols1 <= j; cols1++) {
				sum = sum + arr[rows1][cols1];
			}
		}
		sum = sum - (arr[rows + 1][cols] + arr[rows + 1][j]);//removing the second row except the middle element from sum to get hourglass sum
		return sum;
	}

}
