package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TwentyEight {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		List<String> names = new LinkedList<String>();
		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");
			String[] gmail = firstNameEmailID[1].split("(?=@)");
			if (gmail[1].replaceAll("\\s+","").equals("@gmail.com")) {
				names.add(firstNameEmailID[0]);
			}
		}
		Collections.sort(names);
		for (String string : names) {
			System.out.println(string);
		}
		scanner.close();
	}
}
