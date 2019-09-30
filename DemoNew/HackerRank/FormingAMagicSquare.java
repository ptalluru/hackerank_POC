package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class FormingAMagicSquare {

	// Complete the formingMagicSquare function below.
	static int formingMagicSquare(int[][] s) {
		int[][][] p = {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
				{{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
				{{8, 3, 4}, {1, 5, 9}, {6, 7, 2}}, 
				{{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, 
				{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}}, 
				{{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, 
				{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}, 
				{{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}};
	int min = 100;
	for (int i = 0; i < 8; i++) {
		int diff = 0;
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				diff += Math.abs(p[i][x][y] - s[x][y]);
			}
		}
		if (diff < min)
			min = diff;
	}
		return min;
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
