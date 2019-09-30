package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class ElectronicsShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		//int maxKeyboard = Collections.max(Arrays.asList(Arrays.stream(keyboards).boxed().toArray(Integer[]::new)));
		//int maxdrive = Collections.max(Arrays.asList(Arrays.stream(drives).boxed().toArray(Integer[]::new)));
		int result = 0;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i : keyboards) {
			for (int j : drives) {
				int sum = i;
				sum = sum+j;
				int diff = b - sum;
				if(sum<=b) {
					map.put(sum, diff);
				}
			}
		}
		if(map.isEmpty()) {
			result = -1;
		}else {
			int minDiff = Collections.min(map.values());
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue().equals(minDiff)) {
					result = entry.getKey();
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
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        */
        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println("MoneySpent :- "+moneySpent);
        scanner.close();
    }
}
