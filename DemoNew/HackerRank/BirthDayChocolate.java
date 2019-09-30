package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthDayChocolate {

	// Complete the birthday function below.
	static int birthday(List<Integer> s, int d, int m) {
		int[] list = s.stream().mapToInt(Integer::intValue).toArray();
		int count = 0;
		for(int i = 0 ; i<s.size();i++) {
			int sum = 0;
			for(int j=0;j<m;j++) {
				if((i+j)<s.size()) {
					sum = sum + list[i+j];
				}
			}
			if(sum==d) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		System.out.println("Enter the array elements");
		List<Integer> s = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			s.add(sc.nextInt());
		}
		System.out.println("Enter the birth date");
		int d = sc.nextInt();
		System.out.println("Enter the birth month");
		int m = sc.nextInt();

		int result = birthday(s, d, m);
		System.out.println("result"+result);
	}
}
