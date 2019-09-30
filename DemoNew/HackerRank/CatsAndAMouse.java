package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class CatsAndAMouse {

	// Complete the catAndMouse function below.
	static String catAndMouse(int x, int y, int z) {
		int A2C = Math.abs(x-z);
		int B2C = Math.abs(y-z);
		String result = null;
		if(A2C<B2C) {
			result = "Cat A";
		}else if(B2C<A2C) {
			result = "Cat B";
		}else if(A2C==B2C) {
			result = "Mouse C";
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of queries");
		int q = scanner.nextInt();
		for (int qItr = 0; qItr < q; qItr++) {
			System.out.println("Enter Cat A Position");
			int x = scanner.nextInt();
			System.out.println("Enter Cat A Position");
			int y = scanner.nextInt();
			System.out.println("Enter Cat A Position");
			int z = scanner.nextInt();
			String result = catAndMouse(x, y, z);
			System.out.println("result"+result);
		}
		scanner.close();
	}
}
