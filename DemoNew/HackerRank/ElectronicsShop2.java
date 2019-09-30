package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class ElectronicsShop2 {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int result = -1;
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				if (keyboards[i] + drives[j] <= b && keyboards[i] + drives[j] > result) {
					result = keyboards[i] + drives[j];
				}
			}

		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter her budget");
		int b = scanner.nextInt();
		System.out.println("Enter the no. of keyboard models");
		int n = scanner.nextInt();
		System.out.println("Enter the no. of usb drive models");
		int m = scanner.nextInt();
		System.out.println("Enter the prices of each keyboard model");
		int[] keyboards = new int[n];
		for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
			int keyboardsItem = scanner.nextInt();
			keyboards[keyboardsItr] = keyboardsItem;
		}
		System.out.println("Enter the prices of each usb drive model");
		int[] drives = new int[m];
		for (int drivesItr = 0; drivesItr < m; drivesItr++) {
			int drivesItem = scanner.nextInt();
			drives[drivesItr] = drivesItem;
		}
		/*
		 * The maximum amount of money she can spend on a keyboard and USB drive, or -1
		 * if she can't purchase both items
		 */
		int moneySpent = getMoneySpent(keyboards, drives, b);
		System.out.println("MoneySpent :- " + moneySpent);
		scanner.close();
	}
}
