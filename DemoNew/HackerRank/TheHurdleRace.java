package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
    	int max = Arrays.stream(height).max().getAsInt();
    	int result = 0;
    	if(k<max) {
    		result = max-k;
    	}
		return result;
    }
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of hurdles");
        int n = scanner.nextInt();
        System.out.println("Enter the natural height dan can jump");
        int k = scanner.nextInt();
        System.out.println("Enter the heights of hurdles");
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            int heightItem = scanner.nextInt();
            height[i] = heightItem;
        }
        int result = hurdleRace(k, height);
        System.out.println("Result"+result);
        scanner.close();
    }
}
