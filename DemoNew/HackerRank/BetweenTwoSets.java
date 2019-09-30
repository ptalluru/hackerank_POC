package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */
public class BetweenTwoSets {
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		List<Integer> aDiv1 = new ArrayList<Integer>();
		Set<Integer> commonCheck = new HashSet<Integer>();
		List<Integer> common = new ArrayList<Integer>();
		Set<Integer> factors = new HashSet<Integer>();
		//finding the integer which satisfies the element in array a is a factor and storing them in the list
		for (Integer integer : a) {
			for (int i = 1; i <= 100; i++) {
				if (i >= integer) {
					if ((i % integer == 0)) {
						aDiv1.add(i);
					}
				}
			}
		}
		//storing the elements in the list whose frequency equals to array a size because all the elements in the array
		//a should be the facors of each element in the list
		for (Integer integer : aDiv1) {
			if (Collections.frequency(aDiv1, integer) == a.size()) {
				commonCheck.add(integer);
			}
		}
		//finding the integers in the set should be the factors of each element in array b
		for (Integer integer : b) {
			for (Integer integer2 : commonCheck) {
				if (integer >= integer2) {
					if (integer % integer2 == 0) {
						common.add(integer2);
					}
				}
			}
		}
		for (Integer integer : common) {
			if (Collections.frequency(common, integer) == b.size()) {
				factors.add(integer);
			}
		}

		return factors.size();
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of first array");
		int n = sc.nextInt();// 1<=n<=10
		System.out.println("Enter the length of second array");
		int m = sc.nextInt();// 1<=m<=10
		Integer[] aArray = new Integer[n];
		System.out.println("Enter the first array");
		for (int i = 0; i < n; i++) {
			aArray[i] = sc.nextInt();
		}
		List<Integer> arr = Arrays.asList(aArray);
		Integer[] bArray = new Integer[m];
		System.out.println("Enter the second array");
		for (int i = 0; i < m; i++) {
			bArray[i] = sc.nextInt();
		}
		List<Integer> brr = Arrays.asList(bArray);
		int total = getTotalX(arr, brr);
		System.out.println(String.valueOf(total));
	}
}
