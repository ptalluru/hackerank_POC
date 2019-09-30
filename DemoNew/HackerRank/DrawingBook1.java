package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class DrawingBook1 {

	/*
	 * Complete the pageCount function below.
	 */
	static int pageCount(int n, int p) {
		int result = 0;
		int front = p / 2;
		int back = n / 2 - front;
		if (front < back) {
			result = front;
		} else {
			result = back;
		}
		return result;
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
