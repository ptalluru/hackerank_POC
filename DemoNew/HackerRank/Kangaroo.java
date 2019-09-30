package com.demo.cg.DemoNew.HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		String result = null;
		int jump1 = x1 + v1;
		int jump2 = x2 + v2;
		int newPosition1 = jump1;
		int newPosition2 = jump2;
		if (x1 >= 0 && x1 <= 10000 && x2 >= 0 && x2 <= 10000 && v1 >= 1 && v1 <= 10000 && v2 >= 1 && v2 <= 10000) {
			for (int i = 0; i < 10000; i++) {
				if ((newPosition1 == newPosition2) && newPosition1 != 0 && newPosition2 != 0) {
					result = "YES";
					break;
				} else {
					newPosition1 = newPosition1 + v1;
					newPosition2 = newPosition2 + v2;
					if (i >= 9999) {
						result = "NO";
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int v1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int v2 = scanner.nextInt();
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
		scanner.close();
	}
}
