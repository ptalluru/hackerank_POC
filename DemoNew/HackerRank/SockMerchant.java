package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		Integer[] array = Arrays.stream(ar).boxed().toArray(Integer[]::new);
		List<Integer> list = Arrays.asList(array);
		Set<Integer> set = new HashSet<Integer>(list);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println("Set"+set);
		for (Integer integer : set) {
			int count = Collections.frequency(list, integer);
			if (count % 2 != 0) {
				count = count - 1;
			}
			map.put(integer, count);
		}
		System.out.println("Map"+map);
		Collection<Integer> socks = map.values();
		System.out.println(socks);
		int result = (socks.stream().mapToInt(Integer::intValue).sum())/2;
		return result;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of socks");
		int n = scanner.nextInt();
		System.out.println("Enter the array of socks");
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int arItem = scanner.nextInt();
			ar[i] = arItem;
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
		scanner.close();
	}
}
