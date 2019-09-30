package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PickingNumbers {
	/*
	 * Complete the 'pickingNumbers' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static int pickingNumbers(List<Integer> a) {
		Set<Integer> set = new HashSet<Integer>(a);
		int[] array = set.stream().mapToInt(Integer::intValue).toArray();
		int[] array1 = a.stream().mapToInt(Integer::intValue).toArray();
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			List<Integer> list1 = new ArrayList<Integer>();
			if (array[i] > 0 && array[i] < 100) {
				for (int j = 0; j < array1.length; j++) {
					if ((array1[j] == (array[i] - 1) || array1[j] == array[i])) {
						list.add(array1[j]);
					}if ((array1[j] == (array[i] + 1) || array1[j] == array[i])) {
						list1.add(array1[j]);
					}if(j==(array1.length-1)) {
						if(list.size()>result) {
							result=list.size();
						}else if(list1.size()>result) {
							result=list1.size();
						}
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the list");
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			a.add(input);
		}
		int result = pickingNumbers(a);
		System.out.println("Result :-" + result);
	}
}
