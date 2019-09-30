package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class FormingAMagicSquare1 {

	// Complete the formingMagicSquare function below.
	static int formingMagicSquare(int[][] s) {
		int cost = 0;
		int d1Sum = 0;
		int d2Sum = 0;
		int[] row = new int[3];
		int[] col = new int[3];
		for (int i = 0; i < s.length; i++) {
			int rowSum = 0;
			int colSum = 0;
			for (int j = 0; j < s.length; j++) {
				rowSum = rowSum + s[i][j];
				colSum = colSum + s[j][i];
				if (i == j) {
					d1Sum = d1Sum + s[i][j];
				}
				if (i == 2 - j) {
					d2Sum = d2Sum + s[i][j];
				}
				if (j == s.length - 1) {
					row[i] = rowSum;
					col[i] = colSum;
					if(row[i]!=15) {
						if(d1Sum!=15) {
							if(col[i]!=15) {
								
							}
						}else if(d2Sum!=15) {
							if(col[2]!=15) {
								
							}
						}
					}
				}
			}
		}
		if (row[0] == 15 && row[1] == 15 && row[2] == 15 && col[0] == 15 && col[1] == 15 && col[2] == 15 && d1Sum == 15
				&& d2Sum == 15) {
			cost = 0;
		}
		return cost;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the matrix");
		int[][] s = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int sItem = scanner.nextInt();
				s[i][j] = sItem;
			}
		}
		int result = formingMagicSquare(s);
		System.out.println("Result:- " + result);
		scanner.close();
	}
}
