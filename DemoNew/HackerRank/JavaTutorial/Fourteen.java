package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		this.elements = a;
	}

	public void computeDifference() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = i; j < elements.length; j++) {
				if(j+1<elements.length) {
					int tempDiff = Math.abs(elements[i]-elements[j+1]);
					if(tempDiff>maximumDifference) {
						maximumDifference = tempDiff;
					}
				}	
			}
		}
	}
}

public class Fourteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}