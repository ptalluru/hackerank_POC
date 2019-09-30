package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MigratoryBirds {

	// Complete the migratoryBirds function below.
	static int migratoryBirds(List<Integer> arr) {
		Set<Integer> set = new HashSet<Integer>(arr);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> keys = new ArrayList<Integer>();
		int result = 0;
		for (Integer integer : set) {
			int count = Collections.frequency(arr, integer);
			map.put(integer, count);
		}
		int max = Collections.max(map.values());
		if (Collections.frequency(map.values(), max) > 1) {
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue().equals(max)) {
					keys.add(entry.getKey());
				}
			}
			result = Collections.min(keys);
		} else {
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue().equals(max)) {
					result = entry.getKey();
				}
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array count");
		int arrCount = sc.nextInt();
		System.out.println("Enter the array elements");
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < arrCount; i++) {
			arr.add(sc.nextInt());
		}
		int result = migratoryBirds(arr);
		System.out.println("result :- " + result);
	}
}
